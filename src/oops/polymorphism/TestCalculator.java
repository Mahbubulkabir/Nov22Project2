package oops.polymorphism;

public class TestCalculator {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.add(1, 3, 5);

        AdvancedCalculator ac = new AdvancedCalculator();
        ac.add(4, 5);

    }
}
