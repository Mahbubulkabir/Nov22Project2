package oops.abstraction;

public interface Car extends Motor,Wheel{

    //interface: road map
    //interface: full-fledged abstract class
    //declare abstract methods
    int number = 45;

    void start();

    void brake();

    String careShape();
}
