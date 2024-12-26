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
    }
}
