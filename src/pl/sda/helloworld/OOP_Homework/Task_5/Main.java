package pl.sda.helloworld.OOP_Homework.Task_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------CONSTANT PAYMENT---------------------------");
        Employee constantPaymentEmployee1 = new ConstantPayment("John", "Doe", "IT");
        System.out.println(constantPaymentEmployee1);
        System.out.println(constantPaymentEmployee1.getSalary(7000));
        Employee constantPaymentEmployee2 = new ConstantPayment("Mark", "Sizmore", "IT");
        System.out.println(constantPaymentEmployee2);
        System.out.println(constantPaymentEmployee2.getSalary(5000));

        System.out.println("------------------HOURLY RATE PAYMENT---------------------------");
        Employee hourlyRatePaymentEmployee1 = new HourlyRate("Gregory", "McDondalds", "PR", 20, 8);
        System.out.println(hourlyRatePaymentEmployee1);
        System.out.println(hourlyRatePaymentEmployee1.getSalary(3));
        Employee hourlyRatePaymentEmployee2 = new HourlyRate("Katherine", "Richards", "Marketing", 12, 8);
        System.out.println(hourlyRatePaymentEmployee2);
        System.out.println(hourlyRatePaymentEmployee2.getSalary(3));

        System.out.println("------------------TASK BASED PAYMENT---------------------------");
        Employee taskBasedPaymentEmployee1 = new TaskBased("Richard", "Kowalski", "IT", TaskBased.defineTasks());
        System.out.println(taskBasedPaymentEmployee1);
        System.out.println(taskBasedPaymentEmployee1.getSalary(3));
        Employee taskBasedPaymentEmployee2 = new TaskBased("Michael", "McCormack", "Marketing", TaskBased.defineTasks());
        System.out.println(taskBasedPaymentEmployee2);
        System.out.println(taskBasedPaymentEmployee1.getSalary(6));
    }

}
