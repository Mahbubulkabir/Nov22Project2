package collections.set;

import java.util.LinkedHashSet;

public class UseLinkedHashSet {
    public static void main(String[] args) {
        //keeps the given order
        //does not accept duplication
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Jack");
        set.add("John");
        set.add("brad");
        set.add("david");
        set.add("Brook");

        System.out.println(set);
    }
}
