package pl.sda.helloworld.OOP_Homework.Task_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Point {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Podaj X");
                int xValue = scanner.nextInt();
                System.out.println("Podaj Y");
                int yValue = scanner.nextInt();
                defineQuadrants(xValue, yValue);

            } catch (InputMismatchException e) {
                System.out.println("Błędny typ danych!");
                scanner.nextLine();
            }
        }
    }

    public enum Quadrants {
        I, II, III, IV
    }

    static String defineQuadrants(int x, int y) {

        if (x > 0 && y > 0) {
            System.out.println("Punkt leży w ćwiartce: " + Quadrants.I);
        } else if (x < 0 && y > 0) {
            System.out.println("Punkt leży w ćwiartce: " + Quadrants.II);
        } else if (x < 0 && y < 0) {
            System.out.println("Punkt leży w ćwiartce: " + Quadrants.III);
        } else if (x > 0 && y < 0)
            System.out.println("Punkt leży w ćwiartce: " + Quadrants.IV);
        return null;
    }

}