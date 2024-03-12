package day23_ArrayListContinueCollectionUtility;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        //Muhtar solution

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {
            if ( nonDup.contains(each) ) {
                continue;
            }
            nonDup.add(each);
        }
        //names = nonDup;
        System.out.println(nonDup);
        //System.out.println(names);

        // My solution
        for (int i=0; i < names.size(); i++) {
            if (!(names.indexOf(names.get(i)) ==names.lastIndexOf(names.get(i)))) {
                names.remove(names.get(i));
            }
        }
        System.out.println(names);
    }
}
