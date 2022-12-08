package oops.inheritance;

public class Test {
    public static void main(String[] args) {

        //single inheritance: when a class inherits attributes from a single class
        ClassA b = new ClassA();
        b.education();

        ClassB a = new ClassB();
        b.education();

        //multi-level inheritance
        GrandFather brad = new GrandFather();
        brad.rich();

        Father david = new Father(6);
        david.education();
        david.rich();

        Son jack = new Son();
        jack.education();
        jack.rich();

        //Hierarchical inheritance
        brad.communicate();
        Bird sparrow = new Bird();
        sparrow.communicate();

        //java does not support the multiple inheritance
    }
}
