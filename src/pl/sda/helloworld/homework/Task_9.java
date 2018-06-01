package pl.sda.helloworld.homework;

public class Task_9 {

    static int evenCounter = 0;
    static int oddCounter = 0;
    static int[] myArray = new int[]{11, 4, 2, 33, 657, 400, 120, 80, 44, 51, 9, 14, 59, 81};

    public static void main(String[] args) {
        getElementEvenOrOdd(myArray);
        System.out.println("Parzystych " + evenCounter + ", nieparzystych " + oddCounter);
    }

    static void getElementEvenOrOdd(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                ++evenCounter;
            } else {
                ++oddCounter;
            }

        }

    }

}