import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11,10,27};
        Arrays.sort(arr);
        int k=37;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==k){
                break;
            }else if(sum>k){
                j--;
            }else 
                i++;
        }
        System.out.println("The two element are : "+arr[i]+" "+arr[j]);

    }
    
}
