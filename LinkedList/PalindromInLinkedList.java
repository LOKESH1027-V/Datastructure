import java.util.*;
public class PalindromInLinkedList {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
    }

    public static Node arrayToLinkedList(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;

        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
}
