package day20_forEach.warmUpTask;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays_2 {
    public static void main(String[] args) {

        //Muhtar's solution
        int[] arr1 = {1,2,3,4};
        int[]  arr2 = {5,6,7};

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0 ; // for third array's inde x number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("--------------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {70, 80, 90};

        int[] a3 = ArraysUtility.merge(a1, a2);
        System.out.println(Arrays.toString(a3));


        System.out.println("--------------------------------------------------");

        double[] b1 = {10.5, 5.5, 3.5, 6.5, 8.5};
        double[] b2 = {20.5, 15.5, 13.5};

        double[] b3 = ArraysUtility.merge(b1, b2);

        System.out.println(Arrays.toString(b3));

        System.out.println("-----------------------------------------------");

        char[] ch1 = {'A', 'b', 'c', 'D', 'e'};
        char[] ch2 = {'X', 'Y', 'Z'};

        char[] ch3 = ArraysUtility.merge(ch1, ch2);

        System.out.println(Arrays.toString(ch3));

        System.out.println("---------------------------------------");

        String[] c1 = {"Java", "Python", "JavaScript", "Ruby"};
        String[] c2 = {"C#", "C++", "Swift"};

        String[] c3 = ArraysUtility.merge(c1, c2);

        System.out.println(Arrays.toString(c3));



        System.out.println("==========My Solution MergeArrays=================");

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6};

        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = array1.length, j = 0; i < array3.length; i++) {
            array3[i] = array2[j];
            j++;
        }
        System.out.println(Arrays.toString(array3));//[1, 2, 3, 4, 5, 6]


    }
}
/*
write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
 */