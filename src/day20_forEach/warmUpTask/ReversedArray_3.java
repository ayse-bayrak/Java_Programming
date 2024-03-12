package day20_forEach.warmUpTask;

import org.w3c.dom.ls.LSOutput;
import utilities.ArraysUtility;

import java.util.Arrays;

public class ReversedArray_3 {
    public static void main(String[] args) {
        int[]  array = {1,2,3,4,5};
        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {//starting from the last index to first index zero

            reversedArray[j] = array[i];
        }

        System.out.println(Arrays.toString(reversedArray));//[5, 4, 3, 2, 1]

        System.out.println("================================================");

        int[] nums = {100, 200, 300, 400, 500};

        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("================================================");

        double[] a1 = {1.5, 2.5, 3.5, 4.5};
        a1 = ArraysUtility.reverse(a1);
        System.out.println(Arrays.toString(a1));


    }
}

/*
3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
 */