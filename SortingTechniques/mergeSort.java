package SortingTechniques;
public class mergeSort
{

    public static  int[] mergeSort(int arr[],int start,int end)
    {
        if(start==end) {
            return new int[]{arr[start]};
        }

        int mid =(start+end)/2;

        int firstHalf[]=mergeSort(arr,start,mid);
        int secondHalf[]=mergeSort(arr,mid+1,end);
        return merge(firstHalf,secondHalf);
    }


    public static int[] merge(int a[],int b[])
    {
        int res[]= new int[a.length+b.length];
        int i=0 ,j=0,k=0, c=0;

        while (i<a.length&& j<b.length)
        {
            if(a[i]<=b[j])
            {
                res[k++]=a[i++];
            }
            else {
                res[k++]=b[j++];
            }
            c+=a.length-1;
        }
        while(i<a.length)
        {
            res[k++]=a[i++];
        }

        while(j<b.length)
        {
            res[k++]=b[j++];
        }

        return res;

    }



    public static void main(String args[]) {
        int[] arr = {5, 3, 8, 4, 2};
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
        arr =  mergeSort(arr,0,arr.length-1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
