package pl.sda.helloworld.homework;

public class Task_15 {
    static int positiveDeterminant;
    static int negativeDeterminant;

    static int[][] matrix1 = new int[][]{{4, -1, 1}, {4, 5, 3}, {-2, 0, 0}};

    public static void main(String[] args) {
        System.out.println("Macierz: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("------------------------------------");
        positiveDeterminant =
                        (matrix1[0][0] * matrix1[1][1] * matrix1[2][2]) +
                        (matrix1[1][0] * matrix1[2][1] * matrix1[0][2]) +
                        (matrix1[2][0] * matrix1[0][1] * matrix1[1][2]);

        negativeDeterminant =
                        (matrix1[0][2] * matrix1[1][1] * matrix1[2][0]) -
                        (matrix1[1][2] * matrix1[2][1] * matrix1[0][0]) -
                        (matrix1[2][2] * matrix1[0][1] * matrix1[0][0]);

        System.out.println("Wyznacznik: ");
        System.out.println(positiveDeterminant - negativeDeterminant);

    }

}