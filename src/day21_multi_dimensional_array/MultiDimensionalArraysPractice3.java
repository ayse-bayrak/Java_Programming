package day21_multi_dimensional_array;

public class MultiDimensionalArraysPractice3 {
    public static void main(String[] args) {

        int[][][] arr3D1 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };
        int[][][] arr3D2 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };
        int[][][] arr3D3 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };

        int[][][][] arr4D = {   arr3D1, arr3D2, arr3D3};

        System.out.println("=========mine solution================");
        for (int[][][] arr3D : arr4D) {
            for (int[][] arr2D : arr3D) {
                for (int[] arr1D : arr2D) {
                    for (int element : arr1D) {
                        System.out.print(element+ " ");
                    }
                }
            }

        }
        System.out.println();
        System.out.println("=========mine solution================");

        System.out.println("=========Muhtar's solution================");

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        System.out.println(eachElement);
                    }
                }
            }
        }

        System.out.println("=========Muhtar's solution================");

    }
}
