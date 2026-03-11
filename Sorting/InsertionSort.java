import java.util.*;

public class InsertionSort {

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

        insertionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){

        int n = arr.length;

        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr, j-1,j );
                j--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}