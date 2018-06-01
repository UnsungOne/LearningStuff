package pl.sda.helloworld.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_7 {
    static Scanner scanner = new Scanner(System.in);
    static int[][] myArrays = new int[][]{{12, 44, 3, 34, 11, 23}, {23, 34, 234, 5, 2, 23}};

    public static void main(String[] args) {
        while (true) {

            try {
                System.out.println("Enter the value to check: ");
                int userInput = scanner.nextInt();
                if (isContaining(myArrays, userInput)) {
                    System.out.println("The array contains the number: " + userInput);
                } else {
                    System.out.println("The array does not conatin the number: " + userInput);
                }
            } catch (InputMismatchException e) {
                System.out.println("You have not entered valid number");
                scanner.nextLine();
            }
        }
    }

    static boolean isContaining(int[][] arr, int element) {
        boolean isInArray = false;
        for (int[] temporaryInt : arr)
            for (int temporaryInt2 : temporaryInt) {
                if (temporaryInt2 == element) {
                    isInArray = true;
                }
            }
        return isInArray;
    }

}