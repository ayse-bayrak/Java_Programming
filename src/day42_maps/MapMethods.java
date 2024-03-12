package day42_maps;

import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        // if you have a map that already contained multiple pairs in order to add those multiple pairs into another map,
        //then you can use putAll() method
        //Suppose that we have this map which contains the Emloyee id and Employee name as a pair
        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana"); // names (values) can be duplicated

        // and I have another map

        Map<String, String > employees = new LinkedHashMap<>();
        employees.putAll(map); // it allows us to add all the pairs of one map into another map
        // how is it possible that tree map it can be added into the LinkedHashMap
        // object will not be added, only pairs, the pairs will be added
        //by using the putAll() method, we added all the pairs of one map into another map

        System.out.println(employees);
        Map<String, String > employees1 = new TreeMap<>();
        employees1.putAll(map); // this putAll() method it will still implicitly use to put method.
        //When you call this, it is going to iterate the map, add it gets the keys and values one by one and then it used to put() method for what it puts into this map


        employees1.remove("C02");
       boolean remove = employees1.remove("A02", "Khashayar");
        System.out.println(employees1);

        System.out.println(map == employees1);// false //Even though they have the same pairs, I am still getting false.
        // Why am I getting false, since there are two different map objects. They are allocated in two different memory allocations
        // as a matter of fact, in order to compare the values of every single object, we use equals method
        // this equals() method originally came from the object class and it is implemented to all objects. it is inherited to all the classes

        System.out.println(map.equals(employees1)); //true

        // in equals () method, order does matter
        // we had to sort it first, in order to sort the map, we can use three map which can sorted by the keys
        /* You can do like this
        Map<String, String> mapSorted = new TreeMap<>();
        mapSorted.putAll(map);
        Map<String, String> employeeSorted = new TreeMap<>();
        employeeSorted.putAll(employees);

        System.out.println(employees.equals(map));

         */





    }
}
