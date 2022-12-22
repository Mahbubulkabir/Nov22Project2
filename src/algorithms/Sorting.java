package algorithms;

public class Sorting {
    public static void main(String[] args) {

        int[] array = {8,8,8,6,1,0,5,4,7,9};

        int temp;

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (array[j] == array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        for (int a: array) {
            System.out.println(a);
        }
    }
}
