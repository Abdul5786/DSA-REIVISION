package BinarySearch;

public class KokoEatingBananas {

    public int minEatingBananas(int piles[], int h) {
        int low = 1;
        int high = maxPiles(piles);
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canEatAllPiles(piles, h, mid)) {
                ans = mid;
                high = mid - 1; // try to minimize
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int maxPiles(int piles[]) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    public static boolean canEatAllPiles(int piles[], int hours, int speed) {
        int totalHours = 0;
        for (int pile : piles) {
            totalHours += Math.ceil((double) pile / speed);
        }
        return totalHours <= hours;
    }

    public static void main(String[] args) {
        KokoEatingBananas obj = new KokoEatingBananas();

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = obj.minEatingBananas(piles, h);
        System.out.println("Minimum eating speed Koko needs: " + result);
    }
}
