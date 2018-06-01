package pl.sda.helloworld.homework;

public class Task_14 {


    static int[][] matrix1 = new int[][]{{1, 2, 3}, {2, 3, 4}};
    static int[][] matrix2 = new int[][]{{3, 5, 8}, {3, 5, 4}};

    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;

        int[][] sumOfMatrices = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumOfMatrices[i][j] = matrix1[i][j] + matrix2[i][j];
            }

            System.out.println("Result: ");
            for (int[] row : sumOfMatrices) {
                for (int column : row) {
                    System.out.print(column + " ");
                }
                System.out.println();
            }

        }

    }
}