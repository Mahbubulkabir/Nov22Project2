package oops.polymorphism;

public class Calculator {

    //method overloading: when
    public void add(int a, int b){
        int total = a + b;
        System.out.println(total);
    }

    public void add(int a, int b, int c){
        int total = a + b + c;
        System.out.println(total);
    }
}
