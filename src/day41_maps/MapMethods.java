package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        /*
pair: id - name
 */
        // usually we will use map to contain the information one specific object, just information. we do not have to create custom classes
        // I want to do after I store every single pair I need to make sure taht pairs are sorted
        //So we should use TreeMap
        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh"); // entry, any map does have the put method,
        //put method can also be used for updating the values of exsiting keys
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana"); // names (values) can be duplicated
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        System.out.println( map.size()); // 9, count of the number of pairs
        //size() returns the total number of pairs
        System.out.println(map);

        System.out.println( map.get("A04"));

        map.put("A04", "Lucy"); // I need to change value
        map.put("A06", "Madiyar"); // I want to update the value

        System.out.println(map);

        System.out.println(map.get("B03"));
        // get() method returns the value of the specified key
        System.out.println(map.get("0")); //if key does not exits, return null

        map.replace("C02", "Aseel"); // it is faster than put() method, benefit it does not have intention insert, so it would be faster
        map.replace("A07", "Marika");//replace(key, newValue): replaces the value of the specified key with the new value
        System.out.println(map);

        map.remove("A05");//remove(key): removes the pair with the matching key from the map

        System.out.println(map);


        System.out.println(map.containsKey("B03"));//true
        //containsKey(key): returns true if the specified key is included in the map, otherwise returns false
        System.out.println( map.containsKey("H98"));// false

        System.out.println(map.containsValue("Lucy"));
        //containsValue(Value): returns true if the specified Value is included in the map, otherwise returns
        System.out.println(map.containsValue("Muhtar"));

        System.out.println(map.isEmpty()); //false
        System.out.println(map.equals(map)); // true

        map.clear();

        System.out.println(map);//{}

    }
}
