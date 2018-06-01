package pl.sda.helloworld.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int inputValue;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {
                System.out.println("Enter value: ");
                inputValue = scanner.nextInt();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid data");
                scanner.nextLine();
            }

        }
        getifDevidableBy11(inputValue);
    }

    static void getifDevidableBy11(double value) {
        System.out.println(value % 11 == 0 || value % 11 == 0 + 1 ? true : false);

    }
}