package day22_wrapper_class_array_list.warmupTask;

public class MinMax2DArray {
    public static void main(String[] args) {
        int[][] array2D = {{100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}};

        System.out.println("===========1nd approach=================================");

        int max = array2D[0][0];// assumption
        int min = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {

            for (int j = 0; j < array2D[i].length; j++) {

                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                }
                if (array2D[i][j] < min) {
                    min = array2D[i][j];
                }
            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("===========2nd approach=================================");

        max = array2D[0][0];
        min = array2D[0][0];
        for (int[] array1D : array2D) {
            for (int element : array1D) {
                if (element > max) {
                    max = element;
                }
                if (element < min)
                {
                    min = element;
                }
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
/*
2. Write a program that can find the minimum and maximum numbers from
a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000
 */