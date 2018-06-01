package pl.sda.helloworld.collections;

import java.util.Scanner;

public class Trye {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int num[]=new int[5];
        int average=0;
        int i=0;
        int sum=0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println("enter a number");
        for (i=0;i<num.length;i++) {

            num[i]=in.nextInt();
            sum=sum+num[i];
            average=sum/5;

            if (num[i]< min)
                min = num[i];
            else if(num[i]>max)
                max = num[i];

        }

        System.out.println("Sum of values: "+ sum);
        System.out.println("Average of values: "+ average);
        System.out.println("Maximum number is: " + max);
        System.out.println("Minumum number is: "+ min);
    }


}
