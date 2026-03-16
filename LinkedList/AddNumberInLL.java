import java.util.*;

public class AddNumberInLL{

    public static void main(String[] args){

        int[] arr1 = {2,4,6};
        int[] arr2 = {3,8,9,6};

        Node head1 = arrayToLinkedList(arr1);
        Node head2 = arrayToLinkedList(arr2);

        Node result = addLinkedListValue(head1, head2);

        printList(result);
    }

    public static Node arrayToLinkedList(int[] arr){

        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public static Node addLinkedListValue(Node head1,Node head2){

        Node t1 = head1;
        Node t2 = head2;

        Node dum = new Node(-1);
        Node curr = dum;

        int carry = 0;

        while(t1!=null && t2!=null){

            int sum = t1.data + t2.data + carry;

            if(sum>9){
                carry = sum/10;
                sum = sum%10;
            }else{
                carry = 0;
            }

            curr.next = new Node(sum);
            curr = curr.next;

            t1 = t1.next;
            t2 = t2.next;
        }

        while(t1!=null){

            int sum = t1.data + carry;

            if(sum>9){
                carry = sum/10;
                sum = sum%10;
            }else{
                carry = 0;
            }

            curr.next = new Node(sum);
            curr = curr.next;

            t1 = t1.next;
        }

        while(t2!=null){

            int sum = t2.data + carry;

            if(sum>9){
                carry = sum/10;
                sum = sum%10;
            }else{
                carry = 0;
            }

            curr.next = new Node(sum);
            curr = curr.next;

            t2 = t2.next;
        }

        if(carry>0){
            curr.next = new Node(carry);
        }

        return dum.next;
    }

    public static void printList(Node head){

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}