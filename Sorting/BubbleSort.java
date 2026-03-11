import java.util.*;

public class BubbleSort {

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

        bubbleSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){

        int n = arr.length;

        for(int i = n - 1; i > 0; i--){
            boolean flag=false;
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    flag=true;
                }
            }
            if(flag!=true) break;
        }
    }

    public static void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}