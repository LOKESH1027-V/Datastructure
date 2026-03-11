import java.util.*;

public class Selectionsort {

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

        selectionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){

        int n = arr.length;

        for(int i = 0; i < n - 1; i++){

            int min = i;

            for(int j = i + 1; j < n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            swap(arr, i, min);
        }
    }

    public static void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}