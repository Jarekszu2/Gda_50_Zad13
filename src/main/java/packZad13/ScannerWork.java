package packZad13;

import java.util.Scanner;

public class ScannerWork {
    Scanner scanner = new Scanner(System.in);

    public char getCharABCDW() {
        boolean flag = false;
        char znak = 'a';
        do {
            System.out.println();
            System.out.println("Wybierz: a/b/c/d/w ?");
            znak = scanner.next().charAt(0);
            if (znak == 'a' || znak == 'b' || znak == 'c' || znak == 'd' || znak == 'w') {
                flag = true;
            }
        } while (!flag);
        return znak;
    }

    public int getInt(int min, int max) {
        boolean flag = false;
        int number = 0;
        do {
            System.out.println();
            System.out.println("Wprowadź liczbę:");
            String numberString = "";
            numberString = scanner.next();
            try {
                number = Integer.valueOf(numberString);
            } catch (NumberFormatException e) {
                System.err.println("To nie jest liczba!");
            }
            if (number > min && number < max) {
                flag = true;
            }
        } while (!flag);
        return number;
    }
}
