package day42_maps.warmupTask;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {

        /*
         if you converted to Char array, you can not convert it to the collection type
        if you can not convert it to the Collection type then you can not use the frequency method
         because char array it cannot to be converted to the collection type you will have to use another loop
        */

        String  str = "aabcccdeeeef";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
           if (frequency ==1 )
               map.put(each.charAt(0), frequency);
           //only if String has one character, it can convert to char, otherwise string can not convert to char

        }
        System.out.println(map);//{b=1, d=1, f=1}

        /*
        String  str = "aabcccdeeeef";
        String removed ="";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            //map.put(str.charAt(i),1);
            if (map.containsKey(str.charAt(i))){
                map.remove(str.charAt(i));
                removed +=str.charAt(i);
            }else if(!removed.contains(""+str.charAt(i))) {
                map.put(str.charAt(i),1);
            }
        }

        System.out.println(map);


         */
    }
}
/*
2. Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}
 */