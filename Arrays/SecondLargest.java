public class SecondLargest {
    public static void main(String[] args) {
        int[] n={5,1,3,2,7,7};
        int largest=n[0];
        int secondLargest=-1;
        for(int i=1;i<n.length;i++){
            if(largest<n[i]){
                secondLargest=largest;
                largest=n[i];
            }
        }
        System.out.println("Second largest element in the array is :"+secondLargest);
    }
    
}
