package collections.list;

import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[] args) {
        //list keep the given order
        //generic list
        ArrayList list1 = new ArrayList();
        list1.add('%');
        list1.add(0);
        list1.add(5.254);
        list1.add("jack");
        list1.add(true);

        System.out.println(list1.get(4));
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(0);
        list2.add(5);
        list2.add(9);
        list2.add(6);

        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2);
        list2.set(0, 10);
        System.out.println(list2);
    }
}
