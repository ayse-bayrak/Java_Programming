package day41_maps;
import java.sql.Array;
import java.util.*;
// Array and Collection, they both support non-primitives, which means, as long as you have an object,
//You can store it into Array or you can store it into Collection
public class ArrayPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(70, 80, 90, 100, 110));

        // can I store those three objects into an array

        List<Integer>[] arrayOfLists = new List[3]; // let me declare the size is three and set the size to three
        // I can add elements. // you can only store List object into this array
        //Since it is object I need to set them one by one.

        arrayOfLists[0] = list1;
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;

        System.out.println(Arrays.toString(arrayOfLists));
        //[[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]

        arrayOfLists[0].set(4, 50);
        System.out.println(Arrays.toString(arrayOfLists));
        //[[1, 2, 3, 4, 50, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]

        arrayOfLists[1].add(0,10);
        System.out.println(Arrays.toString(arrayOfLists));
        //[[1, 2, 3, 4, 50, 6], [10, 7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]

        Set<Integer>[] arrayOfSets = new Set[5]; // you can only store Set object into this array
        arrayOfSets[0] = new LinkedHashSet<>();
        arrayOfSets[1] = new LinkedHashSet<>();
        arrayOfSets[2] = new LinkedHashSet<>();
        arrayOfSets[3] = new LinkedHashSet<>();
        arrayOfSets[4] = new LinkedHashSet<>();

        System.out.println(Arrays.toString(arrayOfSets));
        //[[], [], [], [], []]
        //this array contains Set objects, if you need  to make change for example third Set, index number 2

        arrayOfSets[2].addAll(Arrays.asList(1, 2, 3, 4));
        // arrayOfSets[2] is collection, and it has addAll method

        System.out.println(Arrays.toString(arrayOfSets));
        //[[], [], [1, 2, 3, 4], [], []]

    }
}
