package pl.sda.helloworld.GAME;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPapers {

    public enum Items {
        ROCK("r"), SCISSORS("s"), PAPER("p");

        static {
            ROCK.beats = SCISSORS;
            SCISSORS.beats = PAPER;
            PAPER.beats = ROCK;
        }

        Items beats;
        String key;

        Items(String key) {
            this.key = key;
        }

        static Items valueFor(String key) {
            for (Items items : values()) {
                if (items.key.equalsIgnoreCase(key))
                    return items;
            }
            return null;
        }
    }

    public static void main(String[] args) {

        int computerGuesses = 0;
        int userGuesses = 0;

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        while (computerGuesses < 3 && userGuesses < 3) {
            System.out.println("Enter your choice:");
            Items[] values = Items.values();
            int index = random.nextInt(values.length);
            Items randomItems = values[index];
            String choice = scanner.nextLine();

            Items item = Items.valueFor(choice);
            System.out.println(item);
            if (item.equals(randomItems)) {
                System.out.println("You guessed!! " + randomItems + " Your score: " + ++userGuesses);
            } else {
                System.out.println("Computer selected " + randomItems + " Computer score " + ++computerGuesses);

            }

        }

    }
}