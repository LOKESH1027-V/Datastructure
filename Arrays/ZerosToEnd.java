import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,2,0,0,4,5,1};
        int i=0;
        int count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0){
                count++;
            }else{
                arr[i]=arr[j];
                i++;
            }
        }
        while (i<arr.length) {
            arr[i]=0;
            i++ ;

        }
        System.out.println(Arrays.toString(arr));
    }
}
