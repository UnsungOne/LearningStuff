package pl.sda.helloworld.OOP_Homework.Task_5;

public class ConstantPayment extends Employee {


    public ConstantPayment(String name, String surname, String department) {
        super(name, surname, department);
    }

    @Override
    double getSalary(int param) {
        return param;
    }
}
