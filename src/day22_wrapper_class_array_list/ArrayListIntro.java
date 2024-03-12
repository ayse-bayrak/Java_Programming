package day22_wrapper_class_array_list;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);  //0  // list is ordered means every single element that is added  it has following index number
        list.add(20);  //1
        list.add(30);  //2
        list.add(10);  //3

        //list.add(5.5);// compile error. that is not matching with the data type
        // make sure that you are providing write argument

        System.out.println(list); //[10, 20, 30, 10]
        // allow without ArrayUtility.toString

        /// in order for inserting of specific index

        list.add(1, 15); //1  // the others original elements just will be shifted to the right

        System.out.println(list);

        list.add(2, 25);

        System.out.println(list);

        System.out.println("----------------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Mohammad");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String firstStudent = studentsList.get(0);

        String lastStudent =  studentsList.get( studentsList.size() -1  );

        System.out.println(firstStudent);
        System.out.println(lastStudent);

    }
}
