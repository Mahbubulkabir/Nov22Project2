package swap;

public class Swap {
    public static void main(String[] args) {

        int a = 4;
        int b = 8;

        int temp;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }
}
