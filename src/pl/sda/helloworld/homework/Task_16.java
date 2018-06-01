package pl.sda.helloworld.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_16 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the word to concat: ");
        String userWord = scanner.nextLine();
        while (true) {

            try {

                System.out.println("Enter concatenation number: ");
                int userConcatenationCounter = scanner.nextInt();
                concat(userWord, userConcatenationCounter);
                System.out.println(concat(userWord, userConcatenationCounter));

            } catch (InputMismatchException | StringIndexOutOfBoundsException e) {
                System.out.println("Invalid type!");
                scanner.nextLine();
            }
        }
    }

    static String concat(String word, int n) {
        String result = new String(new char[n]).replace("\0", word.substring(0, 3));
        return result;
    }

}