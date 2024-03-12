package day42_maps.warmupTask;

import java.util.*;

public class FrequencyCharacters {
    public static void main(String[] args) {
// if you need to find the frequency of every single characters, the characters can be the key of the map and its frequency can be the value of the map
//since requirement want to insertion order, in the same exact order we have to use LinkedHashMap
//Muhtar's lat solution
        String str = "bbcccaaaaa";

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );
            // public static int frequency(Collection<?> c, Object o) { } // from Collections class
            map. put(each, frequency);
        }

        System.out.println(map);


        /*
        String str = "bbcccaaaaa";
        //string to array

        String [] str1 = str.split("");

        //Array to Collection / to Array List
        System.out.println(Arrays.toString(str1));//[b, b, c, c, c, a, a, a, a, a]
        ArrayList<String> str2 = new ArrayList<>( Arrays.asList (str1) );

        System.out.println(str2);//[b, b, c, c, c, a, a, a, a, a]
        Map<String, Integer> map = new LinkedHashMap<>();
        // I will add every single characters of string along with its frequency this map

        for (String each : str2) {
        map.put(each, Collections.frequency(str2, each));
        }

        System.out.println(map);

        */
/*
// oen way convert string to character
        String str = "bbcccaaaaa";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );
            map. put(each.charAt(0), frequency); // oen way convert string to character
        }

        System.out.println(map);
*/

/*my solution

        for (int i = 0; i < str.length(); i++) {

            if (map.containsKey(str.charAt(i))) {
                map.put((str.charAt(i)), (map.get(str.charAt(i))) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
System.out.println(map); //{b=2, c=3, a=5}
 */



    }
}
/*
1. Write a program that can return the frequency of characters
            Not: MUST use map and avoid the nested loop
                Ex: str = "bbcccaaaaa"
                output:
                    {b=2, c=3, a=5}
 */