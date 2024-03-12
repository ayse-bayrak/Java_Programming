package day19_ArrayIntro.practiceTask;

public class MaxMInNumberAyse {
    public static void main(String[] args) {
        int[] arr1 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            int max = arr1[arr1.length -1];
            int min = arr1[0];

            arr1[i] = i+1;
            if(arr1[i]>max) {
                max = arr1[i];
            }
            if (arr1[i]<min) {
                min = arr1[i];
            }

            if(i==arr1.length-1) {
                System.out.println("min = " + min);
                System.out.println("max = " + max);
            }
        }




    }
}
/*
1. Write a program that can find the maximum number from an array

	2. Write a program that can find the minimum number from an array
 */