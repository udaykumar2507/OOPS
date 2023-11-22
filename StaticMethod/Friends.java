
public class Friends {
    //Static is a single copy of a variable or method which is used by the class (Note:not by the object)
    String name;
     static int noofFriends=0;
    Friends(String name){
        this.name=name;
        noofFriends+=1;
    }
    static void no_of_Friends(){
        System.out.println(noofFriends);
    }

    
}
