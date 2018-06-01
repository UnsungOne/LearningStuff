package pl.sda.helloworld.Stuff;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_6 {

    static double a;
    static double b;
    static double c;
    static double x1;
    static double x2;


    public static void main(String[] args) {
        getQuadricEquationValue(a, b, c);
    }

    static void getQuadricEquationValue(double a, double b, double c) {

        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter value for A: ");

            try {
                a = scanner.nextDouble();
                System.out.println(a);
                System.out.println("Enter value for B: ");
                b = scanner.nextDouble();
                System.out.println(b);
                System.out.println("Enter value for C: ");
                c = scanner.nextDouble();
                System.out.println(c);

                double delta = Math.pow(b, 2) - 4 * a * c;
                System.out.println("Delta equals: " + delta);

                if (delta > 0) {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);

                    System.out.println("x1 equals: " + x1 + " and " + "x2 equals: " + x2);
                } else if (delta == 0) {
                    x1 = x2 = -b / (2 * a);

                    System.out.println("There is only one solution x1 = x2: " + x1);
                }

                else {
                    System.out.println("Delta is < 0. There is no solution");
                }

            } catch (InputMismatchException e) {
                System.out.println("The value was not a double!");

            }
            scanner.close();
        }

    }
}