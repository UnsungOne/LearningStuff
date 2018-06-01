package pl.sda.helloworld.collections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Collections_1 {

    public static void main(String[] args) {
        int dayOfBirth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        String myName = scanner.nextLine();

        while (true) {

            try {
                System.out.println("Enter your age: ");
                dayOfBirth = scanner.nextInt();
                break;


            } catch (InputMismatchException e) {
                scanner.nextLine();

            }

        }
        System.out.println(myName);
        System.out.println(dayOfBirth);
    }
}