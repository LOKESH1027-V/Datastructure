import java.util.Arrays;

public class Removeduplicate {
    public static void main(String[] args) {
        int[] n={1,1,2,2,2,3,3};
        int i=0;
        for(int j=1;j<n.length;j++){
            if(n[i]!=n[j]){
                n[i+1]=n[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(n, i+1)));
    }
}
