package pl.sda.helloworld.OOP_Homework.Task_1;

public class Cat extends Animal {

    @Override
    String makeSound() {
       return "mow mow mow";
    }

    @Override
    String getKind() {
     return "fluffy";
    }
}
