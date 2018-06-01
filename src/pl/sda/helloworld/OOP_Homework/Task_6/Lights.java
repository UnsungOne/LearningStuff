package pl.sda.helloworld.OOP_Homework.Task_6;

public class Lights {

    public enum TrafficLights {

        RED, YELLOW, GREEN
    }

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            for (TrafficLights trafficLights : TrafficLights.values()) {
                Thread thread = new Thread();
                System.out.println(trafficLights);
                thread.sleep(10000);

            }

        }
    }
}