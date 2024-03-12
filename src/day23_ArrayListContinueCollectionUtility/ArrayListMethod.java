package day23_ArrayListContinueCollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("-------------------------------------------------");

        //add

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);


        //set()

        // groceriesList[2] = "Oranges";
        groceriesList.set(2, "Oranges");//delete and another value set, [Eggs, paper Towels, Oranges, Cooking oil]

        System.out.println(groceriesList);

        groceriesList.add(2, "Chicken");//insert specify index, [Eggs, paper Towels, Chicken, Oranges, Cooking oil]

        System.out.println(groceriesList);

        //remove()

        groceriesList.remove(0);//delete specify index, [Chicken, Oranges, Cooking oil]

        System.out.println(groceriesList);

        groceriesList.remove("paper Towels"); // delete specify object

        System.out.println(groceriesList);


        System.out.println("-------------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4

        System.out.println(numbers);// [10, 20, 30, 40, 50]

        boolean r1 = numbers.remove( Integer.valueOf(10) );

        System.out.println(numbers);// [20, 30, 40, 50]

        System.out.println(r1);//true

        //clear()

        numbers.clear();// size set the zero

        System.out.println(numbers);//[]
        System.out.println(numbers.size());//0


        System.out.println("-------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        //indexOf () lastIndexOf ()

        System.out.println(  names.indexOf("Vasyl") ); // 0 == first matching
        System.out.println( names.lastIndexOf("Vasyl") ); // 1 last matching

        System.out.println( names.lastIndexOf("Sumeye") );//5 last matching

        // contains()

        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasAli = names.contains("Ali"); // true

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);

        System.out.println("-------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1);//[10]
        System.out.println(list2);//[10]

        System.out.println(list1 == list2);//true


        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);//[10]
        System.out.println(l2);//[10]

        System.out.println(l1 == l2); //false

        System.out.println(l1.equals(l2));//true


        System.out.println("-------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);//n1 = [10, 20, 30]
        System.out.println("n2 = " + n2);//n2 = [30, 10, 20]

        System.out.println(n1.equals(n2));//false, not same order


        System.out.println(n1.isEmpty()); //false
        System.out.println(n2.isEmpty()); //false

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty()); //true
        System.out.println(n2.isEmpty()); //true


    }

}
