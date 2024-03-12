package day22_wrapper_class_array_list;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3, 255);

       // numbers.add(300, 2000);//Because you do not have this index number, you do not skip the index number in our array

        System.out.println(numbers); //{100, 200, 300, 255, 400, 500}

        System.out.println("-------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------------------------");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------------------------");

        for (Integer each : numbers) {
            System.out.println(each);
        }







    }

}
