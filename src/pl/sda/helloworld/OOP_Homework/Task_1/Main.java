package pl.sda.helloworld.OOP_Homework.Task_1;

public class Main {

    static Animal[] animals = new Animal[]{new Cat(), new Dog()};

    public static void main(String[] args) {

        for (Animal animals : animals) {

            System.out.println("---------MAKING SOUND-------");
            System.out.println(animals.makeSound());
            System.out.println("---------GETTING KIND-------");
            System.out.println(animals.getKind());
        }

    }
}
