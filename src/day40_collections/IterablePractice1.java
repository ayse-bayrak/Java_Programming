package day40_collections;

import java.util.*;

public class IterablePractice1 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        //Iterator<Integer> iterator = list.iterator();
        //System.out.println( iterator.hasNext() );// false, now it is empty
       //System.out.println(iterator.next());//error ==> NoSuchElementException

        list.addAll(Arrays.asList(10));
        Iterator<Integer> iterator = list.iterator();
        System.out.println( iterator.hasNext() );//true
        System.out.println(iterator.next());//10


        System.out.println("-----------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        // removed the name that are named Ahmet

        Iterator<String> it = names.iterator(); // This is how can get the iterator object which contains the whole iteration of this collection

        while(it.hasNext()){
            String each = it.next();
            if(each.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("----------------------REMOVE IF METHOD-------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        names2.removeIf( p -> p.equalsIgnoreCase("ahmed"));

        System.out.println(names2);

        List<String> names3 = new ArrayList<>(); // Empty ArrayList,
        boolean removing = names3.removeIf( p -> p.equalsIgnoreCase("ahmed"));
        // it returns false, because is empty and remove method() starts with boolean removed = false;
        // and since method is not executed it returns false, while (each.hasNext()) always false
        System.out.println(removing); //false

        System.out.println("--------------------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));

        // find the nth largest number
        int n = 5;
        // we can use teh remove if method to remove the first four maximum numbers nd then next maximum number will be the fifths.

        for (int i = 0; i < n-1; i++) {
            numbers.removeIf(p -> Collections.max(numbers) == p);
        }

        int max = Collections.max(numbers);

        System.out.println(max);



    }
}
