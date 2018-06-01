package pl.sda.helloworld.Stuff;


public class ArrayMoreLearning {

    public static void main(String[] args) {

        String sign = "X";
        String[][] strings = new String[10][];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = new String[i];
            for (int j = 0; j < strings[i].length; j++) {

                strings[i][j] = sign;

            }

        }

        for (String[] temporaryValue : strings) {
            for (String temporaryValue2 : temporaryValue)
                System.out.print(" " + temporaryValue2);
            System.out.println(" ");
        }

    }

}