package packZad13;

import java.util.ArrayList;
import java.util.List;

/*
13 Zadanie:
Stwórz aplikację, która zadaje użytkownikowi kilka działań matematycznych pod rząd, kolejno:
- 4 dodawania
- 4 odejmowania
- 4 mnożenia
- 4 dzielenia

Dokonaj pomiaru czasu ile użytkownik poświęcił na rozwiązanie zadania. Na koniec wypisz użytkownikowi średni czas wykonania działań:
- dodawania
- odejmowania
- mnożenia
- dzielenia.

 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Utilities utilities = new Utilities();
        List<DzialaniaMatematyczne> store = new ArrayList<>();

        utilities.firstTekst();

        for (int i = 0; i < 2; i++) {
            utilities.addByAdding(store);
        }

        for (int i = 0; i < 2; i++) {
            utilities.addBySubtracting(store);
        }

        for (int i = 0; i < 2; i++) {
            utilities.addByMultiplying(store);
        }

        for (int i = 0; i < 2; i++) {
            utilities.addByDivideing(store);
        }

        utilities.printScore(store);
        utilities.printAverage(store);
    }
}
