package Constructor;

public class Human {
    String name;
    int age;
    double salary;
    Human(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    void eat(){
        System.out.println(this.name+"is eating");
    }
    void salary(){
        System.out.println(this.name+"salary is"+this.salary);
    }
}
