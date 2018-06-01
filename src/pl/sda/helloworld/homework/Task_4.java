package pl.sda.helloworld.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_4 {

    static String[] strings = new String[]{"1", "3", "234", "OK", "asdad", "OK2"};
    static Scanner scanner = new Scanner(System.in);
    static int index1 = scanner.nextInt();
    static int index2 = scanner.nextInt();

    public static void main(String[] args) {
        swapElements(strings, index1, index2);
    }

    static void swapElements(String[] arr, int index1, int index2) {

        System.out.println("Original array: ");


        try {
            System.out.println("Enter the index of the element from the array you want to swap");
            scanner.nextInt();
            System.out.println("Enter the index of the element from the array to be swaped with");
            scanner.nextInt();
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
                String string = arr[index1];
                arr[index1] = arr[index2];
                arr[index2] = string;
                System.out.print(arr[index1]);
            }
            System.out.println();
        } catch (IndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Wrong type or out of bound exception");
            scanner.nextLine();
        }


    }
}
