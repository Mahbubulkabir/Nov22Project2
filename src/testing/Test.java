package testing;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {

        //test data: 50, 40
        //expected salary result: 2000
        //expected final salary results: 2400

        int expectedSalary = 2000;
        int expectedFinalSalary = 2400;

        int hourlyRate = 50;
        int numberOfHours = 40;

        int bonus = 20;

        int salary = hourlyRate * numberOfHours;

        Assert.assertEquals(expectedSalary, salary);

        int finalSalary = salary + ((salary * bonus)/100);

        Assert.assertEquals(expectedFinalSalary, finalSalary);

        //junit has test listeners
    }
}
