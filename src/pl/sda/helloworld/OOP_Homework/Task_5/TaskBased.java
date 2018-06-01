package pl.sda.helloworld.OOP_Homework.Task_5;

import java.util.Random;


public class TaskBased extends Employee {
    static Random random = new Random();
    int task;

    public TaskBased(String name, String surname, String department, int task) {
        super(name, surname, department);
        this.task = task;

    }

    static int defineTasks() {
        int x = random.nextInt(3);
        if (x == 2 && x < 3) {
            x = x + 34 / 2;
        } else if (x == 1 && x < 2) {
            x = x + 3;
        } else if (x == 0 && x < 1) {
            x = x + 12;
        }
        return x;
    }

    @Override
    double getSalary(int param) {
        return param * defineTasks();
    }
}
