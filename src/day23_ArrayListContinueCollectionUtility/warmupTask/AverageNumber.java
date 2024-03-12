package day23_ArrayListContinueCollectionUtility.warmupTask;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(5);

        int sum = 0;
        for (Integer each : list) {
            sum += each;
        }

        double average = sum / (double) list.size();

        System.out.println("Average number is " + average);
    }
}
/*
2. Write a program that can find the average number from an arrayList of integers

 */