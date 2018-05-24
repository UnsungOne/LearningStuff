package pl.sda.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task_7_Stream {

    static List<String> listOfStrings = new ArrayList<>();

    public static void main(String[] args) {

            listOfStrings.add("test");
            listOfStrings.add("somehing");
            getDataUsingStream();
        }


    static void getDataUsingStream() {

        List<String> streamableList = listOfStrings
                .stream()
                .filter(s -> s.length() % 2 == 0)
                .map(s -> s.substring(0, s.length() / 2))
                .collect(Collectors.toList());
        streamableList.forEach(System.out::println);
    }
}