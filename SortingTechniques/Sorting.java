package SortingTechniques;

public class Sorting {

    public static void bubbleSort(int arr[]) {
        // Total passes required: n - 1
        for (int pass = 0; pass < arr.length - 1; pass++) {
            boolean swapped = false;

            for (int curr = 0; curr < arr.length - 1 - pass; curr++) {
                if (arr[curr] > arr[curr + 1]) {
                    swap(arr, curr, curr + 1);
                    swapped = true; // ✅ only if swap happens
                }
            }

            // ✅ Early exit if no swap happened
            if (!swapped) return;
        }
    }

    public static void  selectionSort(int arr[])
    {
          for(int i=0;i<arr.length-1;i++)
          {
              // selecting small index
              int sindex=i;

              for(int j=i+1;j< arr.length;j++)
              {
                  // finding smallest index
                  if(arr[j]<arr[i])
                  {
                      sindex=j;
                  }

                  swap(arr,i,sindex);
              }
          }
    }

    public static void insertionSort(int arr[])
    {

        for(int i=1;i<arr.length;i++)
        {
            int key =arr[i];
            int previous =i-1;

            while(previous>=0 && arr[previous]>key)
            {
                // shifting
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=key;
        }
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String args[]) {
        int[] arr = {5, 3, 8, 4, 2};
//        bubbleSort(arr);
        selectionSort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
