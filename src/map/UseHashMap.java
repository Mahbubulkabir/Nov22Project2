package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UseHashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Josh");
        map.put(2, "Davis");
        map.put(3, "David");
        map.put(4, "Brad");
        map.put(5, "Sean");

        System.out.println(map);

        System.out.println(map.get(1));

        ArrayList<String> usaCities = new ArrayList<>();
        usaCities.add("new york");
        usaCities.add("los angelos");
        usaCities.add("chicago");
        usaCities.add("miami");
        usaCities.add("dallas");

        ArrayList<String> englandCities = new ArrayList<>();
        englandCities.add("london");
        englandCities.add("manchester");
        englandCities.add("liverpool");
        englandCities.add("leicester");
        englandCities.add("cambridge");

        HashMap<String, List<String>> map2 = new HashMap<>();
        map2.put("usa", usaCities);
        map2.put("england", englandCities);

        System.out.println(map2);
    }

}
