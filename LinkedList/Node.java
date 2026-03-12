public class Node {
    public int data;
    public Node next;
    
    public Node(int data){
        this.data=data;
        this.next=null;
    }


    public void traversal(Node head){
        Node mover=head;
        while(mover!=null){
            System.out.print(mover.data+"->");
            mover=mover.next;
        }
    }

    public Node insertHead(Node head,int headValue){
        if(head==null) return new Node(headValue);
        Node newHead=new Node(headValue);
        newHead.next=head;
        return newHead;
    }

    // Deletion process

    public Node deleteHead(Node head){
        if(head==null) return null;
        return head.next;
    }

    public Node deleteLast(Node head){
        if(head==null || head.next==null) return null;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }


    public Node deleteKthElement(Node head,int k){
        if(head==null) return null;
        if(k==1 ) return deleteHead(head);
        Node temp=head.next;
        int count=1;
        Node prev=head;
        while(temp!=null){
            count++;
            if(count==k){
                temp=temp.next;
                prev.next=temp;
                return head;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    
    // End of deletion

    // Staring of insert
    
    public Node insertTail(Node head,int value){
        Node temp= head;
        Node tail=new Node(value);
        if(head==null) return tail;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=tail;
        return head;
    }

    public Node insertInKthPoision(Node head,int value,int posiotion){
        if(head==null) return head;
        else if(posiotion==1) return insertHead(head, value);
        int count=1;
        Node insert=new Node(value);
        Node temp=head.next;
        Node previous=head;
        while(temp!=null){
            count++;
            if(count==posiotion){
                previous.next=insert;
                insert.next=temp;
                return head;
            }
            previous=temp;
            temp=temp.next;

        }
        if(count+1==posiotion){
            previous.next=insert;
        }
        return head;
    }

    

    // Array to LinkedList


}
