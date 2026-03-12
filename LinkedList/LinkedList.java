import java.util.*;
public class LinkedList {
    public static void main(String[] args) {
        int[]  arr={1,2,3,4,5};
        Node head=arrayToLinkedList(arr);
        Node temp=head;
        head=head.insertInKthPoision(head,6,6);
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
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
