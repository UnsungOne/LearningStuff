package pl.sda.helloworld.Intefaces;

public class FileDataStore implements DS {


    @Override
    public void writeValue(String s) {
        System.out.printf("S " + s);
    }

    @Override
    public void readValue() {
        System.out.printf("YEAH");
    }
}