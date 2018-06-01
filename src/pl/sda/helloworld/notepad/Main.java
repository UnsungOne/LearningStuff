package pl.sda.helloworld.notepad;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    String timeStamp = new SimpleDateFormat("HH.mm.ss").format(new Date());
    TextNote note = new TextNote(timeStamp, scanner.nextLine(), 3, scanner.nextLine());
    private final static Scanner scanner = new Scanner(System.in);
    private final Note[] notes = new Note[10];

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private void start() {
        while (true) {
            try {
                System.out.print("Enter 1, 2 or 3: ");
                System.out.println();
                int choices;
                choices = scanner.nextInt();
                switch (choices) {
                    case 1:
                        System.out.println("OK");
                        break;

                    case 2:

                        System.out.println("Set title of the note: ");
                        note.setTitle(scanner.next());
                        System.out.println("Set content of the note: ");
                        note.setContent(scanner.next());
                        System.out.println(note);
                        addNote(note);
                        System.out.println();
                        System.out.println("--------List Of Notes-------");
                        listNote(notes);
                        break;

                    case 3:
                        System.out.println("OK3");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid type!");
                scanner.nextLine();
            }

        }
    }

    private void listNote(Note[] notes) {
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);
        }

    }


    private void addNote(Note note) {
        int index = canAddNote();
        if (index < 0) {
            System.out.println("Brak miejsca");
        } else {
            notes[index] = note;
        }
    }

    private void deleteNote(Note note) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].equals(note)) {
                notes[i] = null;
            }
        }
    }

    private int canAddNote() {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
                return i;
            }
        }
        return -1;
    }

}