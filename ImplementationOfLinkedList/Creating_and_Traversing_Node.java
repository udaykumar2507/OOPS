
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkedList{
    Node head;
    void printlinkedlist(){
     Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    int  size(){
        Node curr=head;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        return count;
    }
}
public class Creating_and_Traversing_Node {
    public static void main(String[] args) {
        linkedList list=new linkedList();
        Node p1=new Node(10);
        Node p2=new Node(11);
        Node p3=new Node(12);
        Node p4=new Node(13);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        list.head=p1;
        list.printlinkedlist();
        
        
       
    }
    
}
