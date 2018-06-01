package pl.sda.helloworld.OOP_Homework.Task_8;

public class Main {
    static double[] doubles = new double[]{2.3, 34.2, 1.5};

    public static void main(String[] args) {
        Function function = new Class1();
        Function function2 = new Class2();
        Function function3 = new Class3();

        for (int i = 0; i < doubles.length; i++) {
            System.out.println("----------CLASS 1----------");
            System.out.println(function.someMethod(doubles[i]));
            System.out.println("----------CLASS 2----------");
            System.out.println(function2.someMethod(doubles[i]));
            System.out.println("----------CLASS 3----------");
            System.out.println(function3.someMethod(doubles[i]));

        }

    }
}
