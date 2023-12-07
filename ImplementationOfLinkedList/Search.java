class linkedlist3 extends linkedList2{
    public int searchIndex(int ele){
        Node curr=head;
        int count=0;
        while(curr!=null){
            if (curr.data==ele){
                return count; 
            }else{
                curr=curr.next;
                count++;
            }
        }
        return -1;
    }

}
public class Search {
    public static void main(String[] args) {
        linkedlist3 ll=new linkedlist3();
        ll.add(5);
        ll.add(10);
        ll.add(15);
        ll.add(20);
        System.out.println(ll.size());
       System.out.println(ll.searchIndex(20));
    }
    
}
