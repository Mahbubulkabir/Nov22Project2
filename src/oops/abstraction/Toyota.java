package oops.abstraction;

public class Toyota implements Car, Wheel{

    //belong to toyota class
    public void carColor(){
        System.out.println("grey");
    }

    //belong to interface car
    public void start() {
        System.out.println("turn the key and start");
    }

    public void brake() {
        System.out.println("brake to stop");
    }

    public String careShape() {
        String shape = "rectangle";
        return shape;
    }

    //java accept multiple implementation
    //belong to Wheel interface
    public void numberOfWheel() {
        System.out.println("4 wheel car");
    }

    //belong to Motor interface
    public void engine() {
        System.out.println("v6");
    }
    public void fuelType() {
        System.out.println("diesel");
    }
}
