package pl.sda.helloworld.homework;

public class Task_10 {

    static final int[] myArrays = new int[]{1, 3, 6, 78, 99, 3, 15, 4, 22};

    public static void main(String[] args) {

        System.out.println(getMax(myArrays) - getMin(myArrays));
    }

    static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];

        for (int somevalue : inputArray) {
            if (somevalue > maxValue) {
                maxValue = somevalue;
            }
        }
        return maxValue;
    }

    static int getMin(int[] inputArray) {
        int minValue = inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

}