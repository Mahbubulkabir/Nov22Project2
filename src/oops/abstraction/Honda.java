package oops.abstraction;

public class Honda extends ModernCar implements Car{

    public void start() {
        System.out.println("keyless car");
    }

    public void brake() {
        System.out.println("Hydraulic brake");
    }

    public String careShape() {
        String shape = "car shape";
        return shape;
    }

    public void engine() {
        System.out.println("v8");
    }

    public void fuelType() {
        System.out.println("electric");
    }

    public void numberOfWheel() {
        System.out.println("4 wheel car");
    }

    public void autoLock() {
        System.out.println("car auto lock after 10 seconds");
    }
}
