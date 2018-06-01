package pl.sda.helloworld.collections;

import java.io.IOException;

public class Exceptions {

    public static void main(String[] args) {
        try {

            System.out.println("In try");
            throw new UnsupportedOperationException("Error");

        } catch (UnsupportedOperationException | ArrayIndexOutOfBoundsException ex) {

            System.out.println("In catch");
            ex.printStackTrace();

        } finally {
            System.out.println("In finally");
        }
    }

    public void throwingMethod() throws IOException {

    }
}
