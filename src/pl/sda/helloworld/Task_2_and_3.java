package pl.sda.helloworld;

public class Task_2_and_3 {

    public static void main(String[] args) {

        /*
        Dodajemy do siebie 2 int. Spodziewałbym się 3.
        Taki rezultat otrzymuje.
        */

        System.out.println(2 + 1);
        System.out.println(((Object) (2 + 1)).getClass());

        /*
        W toerii Spodziewałbym się otrzymać wynik 2.5.
        Tymczasem nie otrzymalem takiego wyniku, ponieważ zwraca liczby całkowite.
        */

        System.out.println(5 / 2);
        System.out.println(((Object) (5 / 2)).getClass());

        /*
        Spodziewałbym się otrzymać wynik 2.5.
        Taki wynik otrzymałem. Float zwrca bowiem liczby dzisiętne.
        */

        System.out.println(5f / 2);
        System.out.println(((Object) (5f / 2)).getClass());

        /*
        Spodziewałbym się otrzymać wynik 2.5.
        Float podzielony przez int zwraca wartości dzisiętne.

        */
        System.out.println(5.0 / 2);
        System.out.println(((Object) (5.0 / 2)).getClass());

        /*
        Spodziewałbym się otrzymać wynik 2.5.
        Float podzielony przez int zwraca wartości dzisiętne.
        */

        System.out.println(5 / 2.0);
        System.out.println(((Object) (5 / 2.0)).getClass());

        /*
        Spodziewałbym się otrzymać wynik 2.5.
        Float podzielony przez float zwraca wartości dzisiętne.
        */

        System.out.println(5.0 / 2.0);
        System.out.println(((Object) (5.0 / 2.0)).getClass());

        /*
        Spodziewałbym się otrzymać wynik mnożenia 100 * 10 = 1000.
        Java zwrac obiekt typu Long
        */


        System.out.println(100L * 10);
        System.out.println(((Object) (100L / 10)).getClass());

        /*
        Spodziwalbym się otrzymać konkatenacje dwóch znaków i wynik f5.
        Tymczasem otrzymalem wynik 107. Java zwraca obiekt typu Integer.
        W tym wypadku java zwraca typ Integer i wynik dodawania 102 (warość f w zestaiw Unicode)  +  int = 5.
        Fajnie byłoby ten temat szerszej wyjaśnć na spotkaniu
         */

        System.out.println('f' + 5);
        System.out.println(((Object) ('f' + 5)).getClass());

        /*
        Spodziwalbym się otrzymać konkatenacje dwóch znaków i wynik f5.
        */

        System.out.println("f" + 5);
        System.out.println(((Object) ("f" + 5)).getClass());

        /*
        Spodziwalbym się otrzymać konkatenacje dwóch znaków.
        Tymczasem otrzymalem wynik 199. Java zwraca obiekt typu Integer..
        StackOverflow podpowiada, że taki sam rezultat otrzymam  dodając do siebie typy byte i short.
        W tym wypadku java zwraca typ Integer i wynik dodawania 99 (warość c w zestaiw Unicode)  + 100 (wartość d w zestawie Unicode).
        Fajnie byłoby ten temat szerszej wyjaśnć na spotkaniu
         */

        System.out.println('c' + 'd');
        System.out.println(((Object) ('c' + 'd')).getClass());

        /*
        Spodziwalbym się otrzymać konkatenacje dwóch znaków i wynik cd bez spacji.
        */

        System.out.println("c" + "d");
        System.out.println(((Object) ("c" + "d")).getClass());
    }
}
