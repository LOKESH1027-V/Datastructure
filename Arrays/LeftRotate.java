import java.util.*;
public class LeftRotate {
    public static void main(String[] args){
        int[] n={1,2,3,4,5,6,7};
        System.out.println("Enter the roatetion of arrays :");
        Scanner scan=new Scanner(System.in);
        int d=scan.nextInt();
        reverseArray(n, 0, d-1);
        reverseArray(n, d, n.length-1);
        reverseArray(n, 0, n.length-1);
        System.out.println(Arrays.toString(n));

    }
    public static int[] reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        return arr;
    }
    
}
