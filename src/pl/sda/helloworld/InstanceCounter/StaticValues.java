package pl.sda.helloworld.InstanceCounter;

public class StaticValues {

    static class InstantCounter {

        static int counter;

        public InstantCounter() {
            counter++;
            System.out.println("Created + " + counter);
        }

        public static void main(String[] args) {

            InstantCounter[] counter = new InstantCounter[10];
            for (int i = 0; i < 10; i++) {
                counter[i]  = new InstantCounter();
                System.out.println(counter);
            }
            System.out.println("Created " + InstantCounter.counter + " instances");

        }
    }
}