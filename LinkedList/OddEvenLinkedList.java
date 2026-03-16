import java.util.*;
public class OddEvenLinkedList {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node head=arrayToLinkedList(arr);
        head=OddAndEvenLinkedList(head);
        head.traversal(head);

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

    public static Node OddAndEvenLinkedList(Node head){
        Node odd=head;
        Node even=head.next;
        Node head2=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=head2;
        return head;
    }
}
