package pl.sda.helloworld.collections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programming {

    public static void main(String[] args) {
        int sum= 0;
        int numberOfInputs = 5;
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] myArray = new int[numberOfInputs];

        for (int i = 0; i < myArray.length; i++) {

            while (true) {
                try {
                    System.out.println("Please enter the integer 5 times: ");
                    myArray[i] = numberOfElements;
                    sum = sum + myArray[i];
                    break;
                } catch (InputMismatchException e) {
                    scanner.nextLine();
                }

            }
            System.out.println(sum);

        }

    }
}
