package pl.sda.helloworld.homework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_8 {
    static Scanner scanner = new Scanner(System.in);
    static int[] arr = new int[]{1, 4, 6, 8, 9, 6, 3, 4};

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("Enter the value to check: ");
                int userInput = scanner.nextInt();
                displayIndices(arr, userInput);
            } catch (ArrayIndexOutOfBoundsException | InputMismatchException exceptions) {
                System.out.println("Wrong type or index is out of bound.");
                scanner.nextLine();

            }
        }
    }

    static void displayIndices(int[] myArray, int myValue) {
        ArrayList positions = new ArrayList();
        for (int i = 0; i < myArray.length; i++) {
            if (myValue == myArray[i]) {
                positions.add(i);

            }
        }
        System.out.println(positions);

    }
}
