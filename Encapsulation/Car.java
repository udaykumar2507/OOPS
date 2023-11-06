package Encapsulation;

public class Car {
    private String name;
    private String model;
    private int year;
    
    Car(String name,String model,int year){
        this.setname(name);
        this.setmodel(model);
        this.setyear(year);
    }
    public String getname(){
        return name;
    } 
     public String getmodel(){
        return model;
    } 
     public int getyear(){
        return year;
    } 
    // for changing the variables then
    public void setname(String name){
        this.name=name;
    } public void setmodel(String model){
        this.model=model;
    }
     public void setyear(int year){
        this.year=year;
    }
}