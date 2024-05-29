package day41_maps;

import day17_customClass.Employee;
import java.util.*;
public class CollectionPractice {
    //Array and Collection, they both support  non-primitives, which means, as long as you have an object,
    //You can store it into Array or you can store it into Collection

    public static void main(String[] args) {
        //   Collection supports non-primitives and so supports any objects
        //List<String>list;// I could have given any non-primitives such as Integer, String
        //List<Integer> list;// I could have given any non-primitives such as Integer, String
        //List<Employee>list; // I can also give the custom Object that I may have
        //What does it mean? it means this list must contain Employee objects.

        List<Integer> list1 = new ArrayList<>();// this is first array list
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5,6));

        List<Integer> list2 = new ArrayList<>();// // this is second array list
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));


        List<List<Integer>> lists = new ArrayList<>(); // this list only accepts List objects, it does not accept any other objects
        // I specify that this object type has to be List of integer.
        // This is a nested list, or it's known as list of list
        // it is not multidimensional, for the collection you do not use the term multidimensional,
        // only for array you use multi dimensional
        // lists.addAll( Arrays.asList(list1, list2));
        lists.add(list1);
        lists.add(list2);

        System.out.println(lists);//[[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11]]
        System.out.println(lists.get(1).get(3));//10

        for(List<Integer> eachList  : lists){ // I have to ue the nested for each loop in order to get every single element
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }
        System.out.println("--------------------------------------------");

        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());  // index number 0
        listOfSets.add(new LinkedHashSet<>());  // index number 1
        listOfSets.add(new LinkedHashSet<>());  // index number 2
        listOfSets.add(new LinkedHashSet<>());  // index number 3
       // size of list is 4
        System.out.println(listOfSets);//[[], [], [], []] // for set total

        // I want to add first object {10, 5, 20, 10, 5, 20}

        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));
        System.out.println(listOfSets);//[[10, 5, 20], [], [], []] // does not duplicate
        listOfSets.get(1).addAll(Arrays.asList(30, 15, 30));
        listOfSets.get(2).addAll(Arrays.asList(300, 150, 40));
        listOfSets.get(3).addAll(Arrays.asList(30000, 1, 5));

        System.out.println(listOfSets);
        //[[10, 5, 20], [30, 15], [300, 150, 40], [30000, 1, 5]]
        //This is a List of Set

        System.out.println("--------------------------------------------");
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9, 10};

        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        //System.out.println(listOfArrays);

        listOfArrays.get(0)[2] = 35;
        System.out.println(  Arrays.toString( listOfArrays.get(0) ) );

        System.out.println("--------------------------------------------");

        //  List<List<Employee>>  teams = new ArrayList<>();
        //   Collection supports non-primitives and so supports any objects


        // List<int[][]>  l = new ArrayList<>();


    }

}
