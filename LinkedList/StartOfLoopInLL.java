import java.util.*;
public class StartOfLoopInLL {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        Node head=arrayToLinkedList(arr);
        Node temp=head;
        Node cycle=head;
        while(temp.next!=null){
            if(temp.data==3){
                cycle=temp;
            }
            temp=temp.next;
        }
        temp.next=cycle;
        System.out.println(startOfTheCycle(head).data);
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

    public static Node startOfTheCycle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast.next!=null && fast!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }

        }
        slow=head;
        while(slow!=fast){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
