
class linkedList1 extends linkedList{

    void add(int e){
        Node temp=new Node(e);
        if (head==null){
            head=temp;
        }else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
        }
    }
    void addFirst(int e){
        Node temp=new Node(e);
        if (head==null){
            head=temp;
        }else{
            temp.next=head;
            head=temp;
        }
    }
    void add(int e,int index){
        if (index==0){
            addFirst(e);
        }else{
            Node temp=new Node(e);
            Node curr=head;
            int count=0;
            while(count<index-1){
                curr=curr.next;
                count++;
            }
            temp.next=curr.next;
            curr.next=temp;
             
        }
    }
    void addall(int arr[]){
        for (int i:arr){
            add(i);
        }
    }
}
public class Add {
    public static void main(String[] args) {
        linkedList1 ll=new linkedList1();
        ll.add(5);
        ll.add(10);
        ll.add(15);
        ll.add(20);
        ll.addFirst(67);
        ll.add(20,2);
        int []arr={100,200,300,400,500};
        ll.addall(arr);
        ll.printlinkedlist();   
    }
}
