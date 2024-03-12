package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {
   /*
     when it comes to iterating the map, you have three options in total
     1-You can iterate all the keys,
     2-You can iterate all the values,
     3-You can iterate all the pairs/entries,
     you need to those three methods,
     keySet(), values(), entrySet()
    */
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>(); // random order, accept null key & null values
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        System.out.println(map);

        System.out.println("------------------------------------------------");

        // if i need to display every single keys that I have in this map, then
        // Iterating the map by the keys

        for (String eachKey : map.keySet()) {
            //map.replace(eachKey,  map.get(eachKey) * 2 );
            System.out.println(eachKey);
        }


        System.out.println("------------------------------------------------");

        // Iterating the map by values
        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("------------------------------------------------");
        // Iterating the map by entries/pairs
        // entrySet() method's return type is entry interface, so in order to iterate the map and get each entry of the map, first, we must call Entry interface from Map interface
        // This entry is the inner interface of the map interface
        // interfaces they can also be nested

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
        }

        /*
        if you know how to iterate the map by the entry, then you wouldn't need values() and keySet() method.
        Because iterating the map by entry, it includes both keys and values. But iterating keys and values are much more faster
         so if you need to just keys or just values you should use keysSet() or Values() methods,
         otherwise iterating the map by entry also does the unnecessary actions.
         */

        System.out.println("------------------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue + 10000);
           //System.out.println(eachKey +" : "+eachValue); // didn't update eachValue
        }

       System.out.println(map);

    }
}
