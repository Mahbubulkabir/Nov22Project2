package oops.abstraction;

public class Test {
    public static void main(String[] args) {

        Toyota camry = new Toyota();
        //car interface methods
        camry.start();
        camry.brake();
        camry.careShape();
        //toyota class method
        camry.carColor();
        //wheel interface method
        camry.numberOfWheel();
        //Motor interface
        camry.fuelType();
        camry.engine();

        Car corolla = new Toyota();
        //Car interface
        corolla.brake();
        corolla.start();
        corolla.careShape();
        //Wheel interface
        corolla.numberOfWheel();
        //Motor interface
        corolla.engine();
        corolla.fuelType();

        Honda civic = new Honda();
        civic.brake();
        civic.start();
        civic.careShape();


    }
}
