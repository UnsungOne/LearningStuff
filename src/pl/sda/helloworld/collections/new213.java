package pl.sda.helloworld.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class new213 {


    static int numberOfElements[] = new int[5];
    static int average = 0;
    static int i = 0;
    static int sum = 0;
    static int max = Integer.MAX_VALUE;
    static int min = Integer.MIN_VALUE;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (i = 0; i < numberOfElements.length; i++) {
            System.out.println("Enter the value");
            numberOfElements[i] = input.nextInt();

        }

        System.out.println(sum = sum + numberOfElements[i]);

        getSum();
        getAverageValue();
    }


    static int getAverageValue() {
        return sum / numberOfElements[i];
    }

    static int getSum() {
        return sum = sum + numberOfElements[i];
    }
    static int getMin(){
        return 4;
    }

}



