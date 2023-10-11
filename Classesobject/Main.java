package Classesobject;
public class Main{
    public static void main(String[] args) {
        Car mycar1=new Car();
        Car mycar2=new Car();
        System.out.println(mycar1.model);
        System.out.println(mycar2.tankfilled);
        mycar1.drive();
        mycar2.brake();
    }
    
}
