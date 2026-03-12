public class ReverseLinkedList{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head=arrayToLinkedList(arr);
        head=reverseLL(head);
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

    public static Node reverseLL(Node head){
        Node temp=head;
        Node previous=null;
        Node next=temp.next;
        while(next!=null){
            temp.next=previous;
            previous=temp;
            temp=next;
            next=next.next;
        }
        temp.next=previous;
        return temp;
    }


    
}