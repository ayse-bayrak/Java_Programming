package day40_collections;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        // I want to remove all the elements that are less than five, I need to iterate this list
        /*
        for each loop, it implicitly used iterator to get the every single element
        iterator()
        • hasNext( )
        • next( )
        • remove( )

        for (Integer each : list) {
            if(each < 5){
                list.remove(each);
            }
        }
      */

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 5) {
                list.remove(i);
            }
        }

        System.out.println(list);
        //[2, 4, 5, 2, 4, 5, 6, 7, 2, 4, 5, 6, 7] it will fail
        //Because when you try to accses the index which are greater than the current index that yo may have,
        //Because after you remove one element, this one's in the original indexes one, but it will be reduce zero,
        //And when you use index one again for the next iteration, it will no longer be referencing to the same element again
        // KEEP IN MIND YOU CAN NEVER USE THE REMOVE METHOD OF THE COLLECTION WHILE YOU ARE ITERATING THAT COLLECTION
        // YOU CAN NOT PROPERLY REMOVE ANY OBJECT FROM A COLLECTION DURING THE LOOP
        //YOU WILL NEED THE ITERABLE
       // until here this part we only write it, why using the loop and using the remove method of collection will not work


        System.out.println("-----------------------------------------------------");

        // iterator is applicable for all the collection, because every single collection objects they do have is relationship with Iterable interface
        //     iterator()
        //        • hasNext( )
        //        • next( )
        //        • remove( )

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        //How many iteration, will be depending on how many elements you have in this collection'

        //list2.iterator(); // we gain Iterable interface

        Iterator<Integer> it = list2.iterator(); // it is better  if you assign it to a reference variable which stands for iterator

        while (it.hasNext()) { // if there is element. it has a fixed iteration
            Integer each = it.next(); // get element
            if (each < 5) {
                it.remove(); // remove element
            }
        }

        System.out.println(list2);//[5, 5, 6, 7, 5, 6, 7]

        //This is how use the iterator with the While loop
        System.out.println("-----------------------------------------------------");
        //This is how use the iterator with the for loop

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext();  ) { // initialization; condition; iterator (if it is needed)

            Integer each = i.next();

            if(each < 5){
                i.remove();
            }
        }
        System.out.println(list3);



        System.out.println("-----------------------------------------------------");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list4.removeIf( each -> each < 5);

        System.out.println(list4);


        System.out.println("-----------------------------------------------------");

        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list5.removeIf( p -> p < 5); // when you write Lambda expression, the preferred way is do not use more than one character for the variable name

        System.out.println(list5);

        // remove if method is the shortcut of the iterator technically

    }
}
