package oops.polymorphism;

public class AdvancedCalculator extends Calculator{

    //method overriding: method use the same name, the same number of parameters but different body
    @Override
    public void add(int a, int b){
        int total = (a + b) * 10;
        System.out.println(total);
    }
}
