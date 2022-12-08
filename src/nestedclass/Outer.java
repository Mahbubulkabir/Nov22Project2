package nestedclass;

public class Outer {

    Inner inner = new Inner();

    int outerNum = 5;

    Outer(){

    }

    public void outerMethod(){
        System.out.println("this is an outer class method");
        inner.innerMethod();
    }

    public class Inner{

        int innerNum = 10;

        Inner(){

        }

        public void innerMethod(){
            System.out.println("this is an inner class method");
        }
    }
}
