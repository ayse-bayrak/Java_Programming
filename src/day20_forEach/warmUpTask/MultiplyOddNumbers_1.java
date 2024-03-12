package day20_forEach.warmUpTask;

import java.util.Arrays;

public class MultiplyOddNumbers_1 {
    public static void main(String[] args) {
//Muhtars solution
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]%2 ==0){
                continue; // skip
            }
            numbers[i] = numbers[i] * 2;
        }

        System.out.println( Arrays.toString(numbers) );

        //solution of mine

        int[] array = {1,2,3,4,5};//// we can not decrease or increase the size,
        // but we can update the values.
        int multiply = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                array[i] = array[i] *2 ;
            }
        }
        System.out.println(Arrays.toString(array));//[2, 2, 6, 4, 10]
    }
}
/*
1. write a program that can multiply each odd number of an integer array by 2
		            ex:
		            	array = [1,2,3,4,5];

	                output:
	                	array =[2,2,6,4,10]
 */