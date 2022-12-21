package itertator;

import java.util.ArrayList;
import java.util.Iterator;

public class UseIterator {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(5);
        list.add(9);
        list.add(6);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());

    }
}
