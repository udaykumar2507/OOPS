
public class Main {
    
    public static void main(String[] args) {
        Friends f1=new Friends("Kishore");
        Friends f2=new Friends("Vishagan");
        Friends f3=new Friends("Venkat");
        System.out.println(Friends.noofFriends);//here friend is common for all the three f1,f2,f3
        Friends.no_of_Friends();
        System.out.println("Not For Concept this below lines");
        System.out.println(f1.name);
        System.out.println(f2.name);
        System.out.println(f3.name);
        
    }

}
