package pl.sda.helloworld.OOP_Homework.Task_5;

public abstract class Employee {

    private String name;
    private String surname;
    private String department;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Employee(String name, String surname, String department) {
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

    abstract double getSalary(int param);
}
