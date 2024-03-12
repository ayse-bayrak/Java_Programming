package day39_collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // accepts duplicates, keeps insertion order, has index
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list);

        System.out.println("----------------------------------------");

        Set<Integer> set1 = new HashSet<>(); // order is random, accepts null key,  does not duplicate
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set1);


        System.out.println("----------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>();  // keeps insertion order, accepts null key, does not duplicate
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set2);

        System.out.println("----------------------------------------");

        String str = null;
        // System.out.println(str.toLowerCase());


        Set<Integer> set3 = new TreeSet<>(); // Keeps sorted order, does not accept duplicate
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        /*
          set3.addAll(Arrays.asList(null, null, null, null, null));
        When the tree set is implemented in backround, it is going to compare every single element in.
        Every single object in the tree side will be compared.
        //ascending order
        */

        System.out.println(set3);


        System.out.println("----------------------------------------");

        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};
        // I want to remove duplicate
        // I should convert to set (HasSet, LinkedHashSet, TresSet)
        //if those orders do not matter, I could use HashSet,
        //If those orders, I want to keep same in order, then it's better if I use LinkedHasSet

        Set<String> result = new LinkedHashSet<>();
        result.addAll( Arrays.asList(words) ); // in order to convert this array to the collection type from the arrays Utility you can still call asList method

      System.out.println(result);//[Java, Python, C#, C++, Ruby] same order and do not duplicate

        /*
        // System.out.println(result.get(1));// set it does not index number,
        therefore you are unable to use the get method to retrieve the element

        for (String each : result) {
            System.out.println(each);
        }
        */
        System.out.println("==============Array List Constructor=====================");

        // every single one of those classes, they have constructed that takes Collection as the argument
        System.out.println( new ArrayList<>(result).get(1) );// for retrieving the specify element, convert to Array List

        // ArrayList<String> arrays = new ArrayList<>(result);
        // System.out.println(arrays);
        result.addAll( Arrays.asList(words) );
        words = result.toArray(new String[0]);  // converting Set to Array
        //it does not matter if you have set or list or Queue any of them you can always convert it to the array.
        //Because all of them is a Collection and Collection has toArray() method
        //What could be the reason why do we have those toArray method in the collection.
        // Because Array is the fastest data structure.

        System.out.println("Words Array : " + Arrays.toString(words));

        System.out.println("----------------------------------------");


        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50,5, 5, 5, 1, 1, 1, 2, 2,2));
        // I want to remove all the duplicates from this array list, and at the same time I want to you to sort this arrayLit ascending Order

        Set<Integer> n = new TreeSet<>(numbers); // convert the List to the Set
        //They have constructor with collection as the argument

        System.out.println(n);


        // numbers = new ArrayList<>(n);



    }
}
