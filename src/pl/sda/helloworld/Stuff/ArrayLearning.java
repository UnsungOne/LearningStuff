package pl.sda.helloworld.Stuff;

import java.util.Random;

public class ArrayLearning {

    public static void main(String[] args) {
        int n = 8;
        double[] something = new double[n];
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            something[i] = r.nextDouble() * n;

        }

        for (double temporaryValue : something) {
            System.out.println(temporaryValue > n / 2 ? temporaryValue + " : wieksze" : temporaryValue + " : mniejsze");
        }

    }

}