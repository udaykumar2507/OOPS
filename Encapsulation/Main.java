package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("bugati","h455",2007);
        //System.out.println(car.name);this will show an error because it is private
        car.setyear(2020);
        System.out.println(car.getyear());

    }
    
}
