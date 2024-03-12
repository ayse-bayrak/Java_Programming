package day23_ArrayListContinueCollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {

        //asList method you can use for converting array to the arrayList
        /*
        The asList() method of java.util.Arrays class is used to return
        a fixed-size list backed by the specified array.
        This method acts as a bridge between array-based and collection-based APIs,
        in combination with Collection.toArray()
         */
        String[] arr = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) );

        System.out.println(list);


        System.out.println("------------------------------------------------------");


        ArrayList<String> list2 = new ArrayList<>( Arrays.asList("Java", "Python", "C#") );

        String[] languages = list2.toArray(new String[0]);

        System.out.println(Arrays.toString(languages));

        System.out.println("------------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        Integer[] n = nums.toArray(new Integer[0]);
        //   int[] n = nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(n));



    }
}
