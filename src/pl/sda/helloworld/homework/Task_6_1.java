package pl.sda.helloworld.homework;

public class Task_6_1 {
    public static void main(String[] args) {
        String[] listOfStrings = new String[]{"u", "z", "o",};
        String[] listOfStrings2 = new String[]{"c", "o", "f"};
        checkDuplicates(listOfStrings, listOfStrings2);
    }

    static void checkDuplicates(String[]arr, String[]arr2) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                String arrayNumberOne = arr[i];
                String arrayNumberTwo = arr2[i];
                    if (arrayNumberOne.equals(arrayNumberTwo)) {
                        System.out.print(arrayNumberOne + arrayNumberTwo);
                    }
                }

            }
        }

    }
