package collections.set;

import java.util.HashSet;

public class UseHashSet {
    public static void main(String[] args) {
        //random order
        //does not accept duplication
        HashSet<String> set = new HashSet<>();
        set.add("Jack");
        set.add("John");
        set.add("brad");
        set.add("david");
        set.add("Brook");

        System.out.println(set);
    }
}
