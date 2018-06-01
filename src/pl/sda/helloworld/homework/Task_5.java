package pl.sda.helloworld.homework;


public class Task_5 {
    static int[] arrays = new int[]{1, 22, 31, 4, 45, 12};

    public static void main(String[] args) {
        reverse(arrays);
    }

    static void reverse(int[] arrays) {
        for (int i = arrays.length - 1; i >=0; i--) {
            System.out.print(arrays[i] + " ");
        }
    }

}
