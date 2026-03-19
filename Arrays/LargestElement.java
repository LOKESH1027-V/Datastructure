
public class LargestElement{
    public static void main(String[] args) {
        int[] array={3,2,1,5,2};
        int largest=-1;
        for(int  i=0;i<array.length;i++){
            if(array[i]>largest)
                largest=array[i];

        }
        System.out.println("Largest element in the array is :"+largest);
    }
}
