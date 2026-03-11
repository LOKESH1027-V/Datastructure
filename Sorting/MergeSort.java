import java.util.*;
public class MergeSort {
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

        mergeSort(arr,0,arr.length-1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);

    }

    public static void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high+1-low];
        int i=0;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[i]=arr[left];
                i++;
                left++;

            }else{
                temp[i]=arr[right];
                i++;
                right++;
            }
        } 
        while(left<=mid){
            temp[i]=arr[left];
            i++;
            left++;
        }
        while(right<=high){
            temp[i]=arr[right];
            i++;
            right++;
        }
        for(int j=0;j<(high+1-low);j++){
            arr[j+low]=temp[j];
        }
    }


}
