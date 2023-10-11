package Constructor;

public class Main {
    public static void main(String[] args) {
        Human hum1=new Human("ryuk",1000,9000000.00);
        Human hum2=new Human("Shinigami",1500,100000000.00);
        System.out.println(hum1.name);
        System.out.println(hum2.age);
        hum2.salary();

    }
    
}
