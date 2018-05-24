package pl.sda.helloworld;

public class Task_2_and_3 {

    public static void main(String[] args) {

        /*
        Dodajemy do siebie 2 int. Spodziewałbym się 3
        */

        System.out.println(2 + 1);

        /*
        Spodziewałbym się otrzymac wynik 2.5. Tymczasem nie otrzymalem takiego wynikuu
        */

        System.out.println(5 / 2);

        /*
        Spodziewałbym się otrzymac wynik 2.5. Tymczasem nie otrzymalem takiego wynikuu
        */
        System.out.println(5f / 2);
        /*
        Spodziewałbym się otrzymac wynik 2.5. Tymczasem nie otrzymalem takiego wynikuu
        */



        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);
        System.out.println(5.0 / 2.0);
        System.out.println(100L * 10);
        System.out.println('f' + 5);
        System.out.println("f" + 5);


        /*
        Spodziwalbym sie, że żtrzymam konkatenacje dwoch znakow.
        Tymczasem otrzymalem wynik 199
         */
        System.out.println('c' + 'd');

        //
        System.out.println("c" + "d"); // Spodziewalbym sie, ze nastapi konkatenacja 2 znakow bez spacji.

    }
}
