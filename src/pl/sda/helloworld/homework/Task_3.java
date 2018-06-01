package pl.sda.helloworld.homework;

import java.util.Random;

public class Task_3 {

    public static void main(String[] args) {
        char club = '\u2663';
        int[] myArray = new int[100];
        Random r = new Random();
        for (int i = 1; i < myArray.length; i++) {
            myArray[i] = r.nextInt(100);
            System.out.println(myArray[i] % 2 == 0 ? i + " - " + myArray[i] + " " + club : i + " - " + myArray[i]);

        }

    }
}
