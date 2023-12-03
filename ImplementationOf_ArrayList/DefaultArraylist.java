package ImplementationOf_ArrayList;

import java.util.Arrays;

public class DefaultArraylist<T> {
    private Object data[];
    private int defaultsize=10;
    private int size=0;
    DefaultArraylist(){
        this.data=new Object[defaultsize];
    }
    public void add(T n){
        if (isFull()){
            resize();
        }
        data[size++]=n;
    }
    private boolean isFull(){
        return data.length==size;
    }
    private void resize(){
        Object []temp=new Object[data.length*2];
        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T removed=(T)(data[size--]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]); 
    }
    public void set(int index,T value ){
        data[index]=value;
    }
    public int size(){
        return data.length;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return Arrays.toString(Arrays.copyOf(data, size));
    }
    public static void main(String[] args) {
        DefaultArraylist<String> list=new DefaultArraylist();
        list.add("ert");
        list.add("eyrfh");
        list.add("fduti");
        String n=list.get(1);
        System.out.println(n);
        System.out.println(list.toString());
    }
    
}
