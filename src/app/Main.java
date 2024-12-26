package app;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {16, 5, 9, 21},
                {7, 17, 7, 3},
                {8, 14, 15, 5},
                {3, 12, 4, 2}
        };
        System.out.println("\nMatrix " + matrix.length + "x" + matrix.length + ":");
        for (int[] array : matrix) {
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        int sumEven = 0;
        int sumOdd = 0;
        int result1 = 1;
        int result2 = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    sumEven += matrix[i][j];
                } else {
                    sumOdd += matrix[i][j];
                }
                if (j % 2 == 0) {
                    result1 *= matrix[i][j];
                } else {
                    result2 *= matrix[i][j];
                }
            }
        }
        System.out.println("\nSum of numbers in even rows (row №0,2) is " + sumEven);
        System.out.println("Sum of numbers in odd rows (row №1,3) is " + sumOdd);
        System.out.println("Result of multiplying elements " +
                "in even columns (column №0,2) is " + result1);
        System.out.println("Result of multiplying elements " +
                "in odd columns (column №1,№3) is " + result2);
    }
}
