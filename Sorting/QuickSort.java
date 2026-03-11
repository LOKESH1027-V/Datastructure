import java.util.*;
public class QuickSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }


    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivot=pivot(arr,low,high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);

        }

    }


    public static int pivot(int[] arr,int low,int high){
        int ps=low;
        while(low<high){
            if(low<high && arr[ps]>arr[low]) low++;
            else if(low<high && arr[ps]<arr[high]) high--;
            else swap(arr,low,high);
        }
        swap(arr,ps,high);
        return high;
    }

    public static void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
