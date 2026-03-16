import java.util.Scanner;

public class RemoveTheNthNodeFromHead {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Node head=arrayToLinkedList(arr);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number which can deleted from the last of linkedlist:");
        int n=scan.nextInt();
        Node fast=head;
        Node slow=head;
        for(int i=0;i<n;i++) 
            fast=fast.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
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
}
