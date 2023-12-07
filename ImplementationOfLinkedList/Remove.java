class linkedList2 extends linkedList1{
    void removelast(){
        if (head==null){
        }else if (head.next==null){
            head=null;
        }else{
            Node curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
        }
    }
    void removefirst(){
        if (head==null){
        }else if (head.next==null){
            head=null;
        }else if (head.next!=null){
            Node curr=head;
            head=head.next;
            curr.next=null;
        }
}
public class Remove {
    public static void main(String[] args) {
        linkedList2 ll=new linkedList2();
        ll.add(5);
        ll.add(10);
        ll.add(15);
        ll.add(20);
        ll.removelast();
        ll.removefirst();
        ll.printlinkedlist();;
        
    }
    
}
}
