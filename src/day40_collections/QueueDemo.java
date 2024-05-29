package day40_collections;

import java.util.*;
//in the after this Java when we start the developer course other, we probably will not use the Queue,
//However in the interview, we are being asked about collection, we may still be asked about the Queue as well
public class QueueDemo {
    public static void main(String[] args) {
        //Queue can be reference three class' object
        Queue<Integer> queue1 = new PriorityQueue<>(); // order is random, does not accept null
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //queue1.addAll(Arrays.asList(null, null, null)); // nullPointerExceptionQueue does not accept null

        System.out.println(queue1);// allow duplicate and order is very random
        //[10, 10, 10, 10, 40, 200, 40, 40, 40, 90, 90, 300, 300, 200, 90, 300, 200, 300, 200, 90]

        int num1 = queue1.poll( ); // poll() method gives the first element and remove it ===> FIFO
        //the poll() method is used to retrieve and remove the head of the queue

        System.out.println(queue1);
        //System.out.println(queue1.get(3)); // Queue and so also PriorityQueue don't have get() method, because no index number

        queue1.poll();
        queue1.poll();
        queue1.poll();


        // if I call this poll method three times, three elements are being removed from the Queue
        //PriorityQueue is random order, how is it going? poll() method is after the add function is done, then it is going to remove whatever the elements is presented first in the priority queues
        System.out.println(queue1);
        //[40, 40, 40, 90, 40, 200, 90, 200, 200, 90, 90, 300, 300, 200, 300, 300]

        //  System.out.println(queue1.get(4));

        //This is my example about how is it run the poll() method?
        Queue<String> queue5 = new PriorityQueue<>(Arrays.asList("Java", "Phyhton", "C++"));
        queue5.add("C");
        queue5.addAll(Arrays.asList("CSharp", "JavaScript", "Java"));
        System.out.println(queue5);
        // First running output [C, C++, Java, Phyhton, CSharp, JavaScript, Java]
        queue5.poll();
        System.out.println(queue5);//[C++, CSharp, Java, Phyhton, Java, JavaScript]
        queue5.poll();
        queue5.poll();
        System.out.println(queue5);//[Java, JavaScript, Java, Phyhton]

        //Actually poll() method retrieve and remove whatever the element is presented first in the priority queues
        // the first element from actual order that after add function and random ordering the elements

        System.out.println("------------------------------------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); // it keeps the insertion order, does not accept null
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //queue2.addAll(Arrays.asList(null, null, null)); // does not accept null

        System.out.println(queue2);

        queue2.poll();

        System.out.println(queue2);//[200, 300, 40, 90, 10, 200, 300, 40, 90]
        //How many time I called the pull() method process, then the queue will be empty ==>9

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2); //[] all the elements in the queue will gone

        //  System.out.println(queue2.get(3));

        System.out.println("---------------------------------------------");

        Queue<Integer> queue3 = new LinkedList<>(); // insertion order, and also accepts null, has index (and also because of being child the List)
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(null, null, null)); // Linked list, it is not just Queue, it is also a list. it still supports null keyword

        System.out.println(queue3);

        queue3.poll(); // first element in this Linked list is 10, ant it is removed

        System.out.println(queue3);


        System.out.println(  ( (LinkedList)queue3).get(4)  ); // this get() method is in the object type, if it is in de object type,
        // since Linked list has index number you can just use the down casting to access that element


        System.out.println("---------------------------------------------");

        List<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list.get(1)); // you are able to call get()

        System.out.println(list);

        // what if I want to call poll() method, then even though reference type does not have poll() method but
        // object type has, in this case we need to the reference type to the LinkednList, can use down casting

        ( (LinkedList)list).poll();  // LinkedList also has FIFO

        System.out.println(list);

        // is it possible that LinkedList can have LIFO
        // ((Stack)list).pop();   // LIFO ,clasCastException  we can not casting stack because no relationship between stack and LinkedList

        System.out.println(list);
        List<Integer> list1 = new LinkedList<>();

        list1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        new ArrayList<>(list1);

//Yilmaz Ebinc response
        Stack<Integer> list2 = new Stack<>();

        list2.addAll(list);

        int a = list2.pop();// deleted last adding element since LIFO
        System.out.println("list = " + list);//list = [200, 300, 40, 90]
        System.out.println("Stack example "+ list2);//Stack example [200, 300, 40]
        System.out.println("a = " + a);//a = 90


        /* my questions
        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        new Vector<>(list);
        new ArrayList<>(list);

        new Stack<>(list); // it gives compile error
        new Stack<>(list).pop(); // it gives compile error,
         */
       //List<Integer> list1= new Vector<>(list);
        //new Stack<>(list1).pop(); // it gives compile error
      //  new Stack<>(list).pop(); I asked to Muhtar I am waiting for his responce
/*
Hi Ayse . Stack is grandchild class of List, but the ArrayList, LinkedList and Vector are
the child classes of list.  When using a constructor it expects you to pass to pass vector or collection that extends it,
and the other classes of list they do not extend the same type as stack

Try converting that list to Vector first and then pass it to the constructor of the stack, then it works
 */


        Collection<Integer> collection2 = new HashSet<>();// use it, if the order does not matter at all.
        collection2.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));


        List<Integer> l = new ArrayList<>(collection2); // you can constantly use this ArrayList object which has the same elements as this HashSet, if you need,
        //KEEP IN MIND THAT YOU CAN NOT DO CASTING TO CONVERT THE SET TO THE LIST,
        // IN THIS CASE YOU HAVE TO USE THE CONSTRUCTOR, SO YOU SHOULD CREATE NEW OBJECT BY CONSTRUCTOR WHAT I WANT TO CONVERT IT
        // BRIEFLY, HAVE USE CONSTRUCTOR IN ORDER TO CONVERT ONE COLLECTION TYPE TO ANOTHER
        //new ArrayList<>(collection2).get(4)





    }
}
