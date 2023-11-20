package ObjectPassing;

public class Main {
    public static void main(String[] args) {
        Garage garage=new Garage();
        Car car=new Car(" Tesla");
        Car car1=new Car(" BMW");
        garage.park(car1);
         garage.park(car);
        
    }
    
}
