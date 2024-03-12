package day41_maps;

import java.util.*;

// if you have multiple pairs that you need tp store, then yuo use the map, other than you don't use the map.
public class MapClasses {
    public static void main(String[] args) {
// when it's time to use the map, you have to specify, what should be the key and what shoul be the value
//Those are the four classes that having is a relationship with the map. So map can be referenced 4 classes object

      //pair: name, salary
        Map<String, Integer> hashMap = new HashMap<>(); // random order, accepts null key & null values
        hashMap.put("Daniel", 95000);  // this is the first pair that I added into this map
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        // map1.put("Daniel", 80000);// because the key can not be duplicated last key of value is assigned to the key
        // when ypu call this put method, you can also use it for updating the values of the specific key.
        //in order to update the values of the keys in the map, you call the put method and use the key
        // if this key is alreaday existed in the map, all it does is change the value to this given value.
        hashMap.put("Arron", 78000);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);
        hashMap.put(null, 120000);
        hashMap.put(null, 110000);
        hashMap.put(null, 100000);//allows one null key and multiple null values

        System.out.println("hashMap = " + hashMap);
        //hashMap = {null=100000, Emily=100000, Breanna=null, Chris=null, Arron=78000, Daniel=95000, Bella=85000}

        System.out.println("--------------------------------------------------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // insertion order, accepts null key  & null values
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);

        System.out.println("linkedHashMap = " + linkedHashMap);
        //linkedHashMap = {Daniel=95000, Emily=100000, Bella=85000, Arron=78000, Chris=null, Breanna=null, null=100000}

        System.out.println("--------------------------------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>(); // sorted order, does not accept null key, accepts null values
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        treeMap.put("Arron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null); // value can be null in treeMap
        // treeMap.put(null, 120000); KEY can NOT be null in treeMap
        //   treeMap.put(null, 110000); KEY can NOT be null in treeMap
        //   treeMap.put(null, 100000); KEY can NOT be null in treeMap

        System.out.println("treeMap = " + treeMap);
        //treeMap = {Arron=78000, Bella=85000, Breanna=null, Chris=null, Daniel=95000, Emily=100000}


        System.out.println("--------------------------------------------------------------------");

        Map<String, Integer> hashtable = new Hashtable<>(); // random order, does not accept null key & null values, Synchronized
        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        hashtable.put("Arron", 78000);
        // hashtable.put("Chris", null); Value in Hashtable can NOT be NULL
        // hashtable.put("Breanna", null); Value in Hashtable can NOT be NULL
        // hashtable.put(null, 120000); Key in Hashtable can NOT be NULL
        // hashtable.put(null, 110000); Key in Hashtable can NOT be NULL

        try {
            hashtable.put("Diana", 100000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }


        System.out.println("hashtable = " + hashtable);



    }
}
/*
pair: name & salary
Daniel = 95000
Emily = 100000
Bella = 85000
 */