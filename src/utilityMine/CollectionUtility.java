package utilityMine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        //you have to apply to collection

        String str = "word";
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max); // 8
        System.out.println("min = " + min);  // 1

        System.out.println("---------------------------------------------------------------");

        ArrayList<String>  items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));

        Collections.sort(items);

        System.out.println(items); // depends on alphabetic order
        //[Blueberry, Eggs, Milk, Orange, Paper towels, Potato, Rice, Strawberry, Tomato]

        System.out.println("---------------------------------------------------------------");

        Collections.reverse(items);
        System.out.println(items);
        //[Tomato, Strawberry, Rice, Potato, Paper towels, Orange, Milk, Eggs, Blueberry]

        System.out.println("---------------------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(  Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal" )   );

        System.out.println(students);
        //[Gadir, Hasan, Abidullah, Bilal]
        Collections.swap(students, 0 , 1);

        System.out.println(students);
        //[Hasan, Gadir, Abidullah, Bilal]

        Collections.swap(students, 0, students.size()-1);

        System.out.println(students);
        //[Bilal, Gadir, Abidullah, Hasan]


    }
}
