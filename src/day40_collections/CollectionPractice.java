package day40_collections;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        //List<Integer> list = new LinkedList<>();
        //List<Integer> list = new Vector<>();
        //List<Integer> list = new Stack<>();
        //Since List is the parent since it's having is a relationship with those classes
        //List can be referenced type whenever we create object from ArrayList, LinkedList,Stack,Vector
        // But List can not be referenced type to other classes like hashset, linked hashset.
        //Because there is no relationship
        //But they are also having is relationship with Collection. So Collection can be referenced type to ArrayList

        Collection<Integer> collection = new ArrayList<>();
        collection.add(100); // yo can call Collection (reference type) method
        collection.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700));
        //addAll() Adds all of the elements in the specified collection to this collection (optional operation).
        //Arrays.asList(....) is used converting array to List
        // (100, 200, 100, 200, 300, 400, 500, 600, 700) this is like array

        System.out.println(collection);
        //[100, 100, 200, 100, 200, 300, 400, 500, 600, 700]

       // System.out.println(collection.get(2)); compile error, because we don't have get() method in the reference type(Collection in here)

        /*
        ArrayList unique method that do not contain Collection
        get()
        set()
        indexOf()
        lastIndexOf()
        Because of Array has index number, those methods needs to index number
         */
        // so we need to downcasting ==> casting the super type to sub type
        // and this can be like this

        System.out.println( ((ArrayList) collection).get(2) );

        // System.out.println( ( (Stack)collection).pop() ); you will get class get exception,
        // because they have is a relationship Stack and object type that is ArrayList

        System.out.println("-------------------------------------------------");
        // I can also let Collection b e reference type to any sort of Set

        //Collection<Integer> collection2 = new LinkedHashSet<>();// use it, if you want to keep the insertion order
        //Collection<Integer> collection2 = new TreeSet<>(); //

        Collection<Integer> collection2 = new HashSet<>();// use it, if the order does not matter at all.
        collection2.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));

        System.out.println(collection2); // does not allow  duplicate

        //   System.out.println(  ( (ArrayList)collection2 ).get(4)  ); // we will get ClassCastException
        //   because no relationship between ArrayList and HasSet

        System.out.println(  new ArrayList<>(collection2).get(4)  ); //in here Array List constructor can take this collection and
        /*
        it will give us the arraylist when it creates the object. And I did not assign it to a reference variable,
        Because this is just for one time use only, I don't need to keep this object after reading the element.
        I can just it will automatically be eligible for garbage collection afterward.
        */

        // if you need to use the index number for multiple times for this HashSet elements, then in this case,
        //you should be assigned it to a reference variable. you see : this collection type is being assigned to the reference type

        List<Integer> l = new ArrayList<>(collection2); // you can constantly use this ArrayList object which has the same elements as this HashSet, if you need,
        //KEEP IN MIND THAT YOU CAN NOT DO CASTING TO CONVERT THE SET TO THE LIST,
        // IN THIS CASE YOU HAVE TO USE THE CONSTRUCTOR, SO YOU SHOULD CREATE NEW OBJECT BY CONSTRUCTOR WHAT I WANT TO CONVERT IT
        // BRIEFLY, HAVE USE CONSTRUCTOR IN ORDER TO CONVERT ONE COLLECTION TYPE TO ANOTHER
    }
}
