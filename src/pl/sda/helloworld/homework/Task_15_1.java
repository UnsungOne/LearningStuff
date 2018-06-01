package pl.sda.helloworld.homework;

public class Task_15_1 {
    static int[][] matrix1 = new int[][]{{2, 1}, {1, 3}};
    static int determinant = 0;
    static int determinant2 = 0;

    public static void main(String[] args) {
        System.out.println("Macierz orginalna: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
                determinant = matrix1[0][0] * matrix1[1][1];
                determinant2 = matrix1[0][1] * matrix1[1][0];
            }
            System.out.println();
        }
        System.out.println("Wyznacznik: ");
        System.out.println(determinant - determinant2);
    }

}

