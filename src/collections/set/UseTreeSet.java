package collections.set;

import java.util.TreeSet;

public class UseTreeSet {
    public static void main(String[] args) {
        //take natural order
        //does not accept duplication
        TreeSet<String> set = new TreeSet<>();
        set.add("jack");
        set.add("john");
        set.add("brad");
        set.add("david");
        set.add("brook");

        System.out.println(set);
    }
}
