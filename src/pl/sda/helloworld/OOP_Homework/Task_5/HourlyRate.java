package pl.sda.helloworld.OOP_Homework.Task_5;

public class HourlyRate extends Employee {

    double rate;
    double hourRate;


    public HourlyRate(String name, String surname, String department, double rate, double hourRate) {
        super(name, surname, department);
        this.rate = rate;
        this.hourRate = hourRate;
    }

    @Override
    double getSalary(int param) {
        return param * hourRate;
    }
}
