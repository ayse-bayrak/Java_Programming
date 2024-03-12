package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        // does not matter if the value is String, char, integer, double Object can be referenced to all of that classes
        //Object can be referenced to Child object, Object class is the parent of all the classes
        Map<String, Object> person1 = new LinkedHashMap<>();
        // usualy this map is just to contain information of one specific object
        person1.put("name", "Arthur"); // keys are going to serve as an index, i will use those keys to get value
        person1.put("gender", 'M');// they should be non-primitive only, they are automatically converted to wrapper class object, auto boxing
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("married", true);

        System.out.println(person1);

        System.out.println( person1.get("name") ); //Arthur
        System.out.println( person1.get("salary")); //100000.5
        System.out.println( person1.get(0)); //Null, it only accepts keys
        System.out.println( person1.get("job_title")); //Developer
    }
}
