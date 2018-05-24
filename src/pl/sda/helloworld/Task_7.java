package pl.sda.helloworld;

import java.util.ArrayList;
import java.util.List;

public class Task_7 {

    static List<String> listOfStrings = new ArrayList<>();

    public static void main(String[] args) {
        listOfStrings.add("test");
        listOfStrings.add("something");
        getStringData();

    }

    static void getStringData() {
        for (String list : listOfStrings) {
            if (list.length() % 2 == 0) {
                System.out.println(list + " -> " + list.substring(0, list.length() / 2));
            } else {
                System.out.println(list + " -> " + "null");

            }

        }

    }
}
