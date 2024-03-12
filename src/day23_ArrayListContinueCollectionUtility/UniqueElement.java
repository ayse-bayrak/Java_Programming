package day23_ArrayListContinueCollectionUtility;

import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");

        for (String name : names) {
        if (names.indexOf(name) == names.lastIndexOf(name)) {
            System.out.println(name);// Ali
            break;
        }
        }

    }
}
