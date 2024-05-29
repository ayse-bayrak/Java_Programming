package day39_collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

       //List<Integer> arrayList = new ArrayList<>(); // All those collection classes and interfaces are from Java.util package
        // This is an Array List, parent (List) it can be referenced to the child object (Array List) .
       // There is upcasting and so polymorphism
        //And also This class can be referenced to its own ob object. like this:

        ArrayList<Integer> arrayList = new ArrayList<>();  // There is no polymorphism, there is no upcasting.
     // array based class ===> get() is faster
       arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);

        arrayList.get(0); // I can call the get method, because get method was inherited from the List interface,
        //How can I prove that, because based on polymorphism's rule, we stated that reference type it decides what can call

        arrayList.remove(0);
        
        //List<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class (Doubly linked List) ===> add(), addAll(), remove(), removeAll(), removeIf(), retainAll() are faster

        // This is a Linked List
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.get(0);

        linkedList.remove(0);

        //ArrayList and LinkedList they do have same, the similar methods functions are same
        // but how it's done in the background are very different.


        //in what cases it's better to use LinkedList or Array List,
        //When you are managing the data, if you have to do lots of insertion and deletion then Linked List would be better choice
        //Other than you will always use the arraylist, because it always the best whenever you are trying to retrieve the element.
    //For example week12_exceptions.practiceTask-ShoppingCard scenario we use Linked List to add and remove the elements to shopping cart

        System.out.println("=======================================================");

        Vector<Integer> vector = new Vector<>();

        vector.add(100); // I can also use the get method, it also has the same methods as the arraylist,
        //technically it is the synchronized version of the ArrayList
        // every single methods of vector, (for example add() method, remove() method or get() method)
        // it does contain one additional keyword synchronized
        //only benefit of synchronized : in the multi threading environment, thread gets executed one at a time.
        vector.add(200);
        vector.add(300);

        vector.get(0);

        System.out.println("------------------------------------------------------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);// last element that we have

        System.out.println(stack);

        int lastElement = stack.pop();// last element will be gone

        System.out.println(lastElement);

        System.out.println(stack);

        int secondLastElement = stack.pop(); // pop method again, second last element will be gone

        System.out.println(secondLastElement);


    }
}
