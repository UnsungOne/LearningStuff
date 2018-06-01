package pl.sda.helloworld.homework;

public class Task_6 {
    public static void main(String[] args) {
        String[][] listOfStrings = new String[][]{{"u", "z", "c"}, {"a", "c", "y"}};

        checkDuplicates(listOfStrings);
    }

    static void checkDuplicates(String[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[k].equals(arr[i][j])) {
                        System.out.print(arr[k] + " ");
                    }
                }

            }
        }

    }
}