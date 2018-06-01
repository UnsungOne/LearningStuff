package pl.sda.helloworld.homework;

import java.util.Random;

public class Task_2 {

    public static void main(String[] args) {

        int[] myArray = new int[101];
        Random r = new Random();
        for (int i = 1; i < myArray.length; i++) {
            myArray[i] = r.nextInt(1000);
            System.out.println(i + " - " + myArray[i]);
        }

    }
}