package pl.sda.helloworld.OOP;

public class OOPMain {

    public static void main(String[] args) {

        Engine engine = new TruckEngine(true);
        System.out.println(engine);
        System.out.println(engine.engineSound());

    }
}