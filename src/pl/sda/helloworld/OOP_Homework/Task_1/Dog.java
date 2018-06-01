package pl.sda.helloworld.OOP_Homework.Task_1;

public class Dog extends Animal {
    @Override
    String makeSound() {
        return "how how how";
    }

    @Override
    String getKind() {
       return "shaggy";
    }
}
