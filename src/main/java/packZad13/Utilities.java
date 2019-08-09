package packZad13;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Utilities {
    private Random random = new Random();
    private ScannerWork scannerWork = new ScannerWork();

    public void firstTekst() {
        System.out.println("Aplikacja zadaje kilka zadań matematycznych a następnie analizuje czas odpowiedzi na nie.");
        System.out.println();
        System.out.println("Postępuj zgodnie z instrukcjami.");
        System.out.println();
    }

    public void addByAdding(List<DzialaniaMatematyczne> store) {
        DzialaniaMatematyczne dzialaniaMatematyczne = new DzialaniaMatematyczne();

        dzialaniaMatematyczne.setRodzajOperacji(RodzajOperacji.DODAWANIE);

        setLocalDateTimeStart(dzialaniaMatematyczne);

        System.out.println();
        System.out.println("DODAJ DWIE LICZBY:");
        int number1 = random.nextInt(100);
        System.out.println("Liczba nr 1: " + number1);
        int number2 = random.nextInt(100);
        System.out.println("Liczba nr 2: " + number2);
        System.out.println(number1 + " + " + number2 + " = ");
        int wynik = scannerWork.getInt(0, 1000);
        if ((number1 + number2) == wynik) {
            System.out.println();
            System.out.println("Wynik prawidłowy.");
            dzialaniaMatematyczne.setCorrectAnswer(1);
        } else {
            System.out.println();
            System.out.println("Wynik błędny.");
            dzialaniaMatematyczne.setIncorrectAnswer(1);
        }

        setLocalDateTimeEnd(dzialaniaMatematyczne);

        store.add(dzialaniaMatematyczne);
    }

    private void setLocalDateTimeEnd(DzialaniaMatematyczne dzialaniaMatematyczne) {
        LocalDateTime end = LocalDateTime.now();
        dzialaniaMatematyczne.setEnd(end);
    }

    private void setLocalDateTimeStart(DzialaniaMatematyczne dzialaniaMatematyczne) {
        LocalDateTime start = LocalDateTime.now();
        dzialaniaMatematyczne.setStart(start);
    }

    public void addBySubtracting(List<DzialaniaMatematyczne> store) {
        DzialaniaMatematyczne dzialaniaMatematyczne = new DzialaniaMatematyczne();

        dzialaniaMatematyczne.setRodzajOperacji(RodzajOperacji.ODEJMOWANIE);

        setLocalDateTimeStart(dzialaniaMatematyczne);

        System.out.println();
        System.out.println("ODEJMIJ LICZBĘ NR2 OD LICZBY NR1:");
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        System.out.println("Liczba nr 1: " + number1);
        System.out.println("Liczba nr 2: " + number2);
        System.out.println(number1 + " - " + number2 + " = ");
        int wynik = scannerWork.getInt(-100, 100);
        if ((number1 - number2) == wynik) {
            System.out.println();
            System.out.println("Wynik prawidłowy.");
            dzialaniaMatematyczne.setCorrectAnswer(1);
        } else {
            System.out.println();
            System.out.println("Wynik błędny.");
            dzialaniaMatematyczne.setIncorrectAnswer(1);
        }

        setLocalDateTimeEnd(dzialaniaMatematyczne);

        store.add(dzialaniaMatematyczne);
    }

    public void addByMultiplying(List<DzialaniaMatematyczne> store) {
        DzialaniaMatematyczne dzialaniaMatematyczne = new DzialaniaMatematyczne();

        dzialaniaMatematyczne.setRodzajOperacji(RodzajOperacji.MNOZENIE);

        setLocalDateTimeStart(dzialaniaMatematyczne);

        System.out.println();
        System.out.println("POMNÓŻ LICZBĘ NR1 I LICZBĘ NR2:");
        int number1 = random.nextInt(100);
        System.out.println("Liczba nr 1: " + number1);
        int number2 = random.nextInt(10);
        System.out.println("Liczba nr 2: " + number2);
        System.out.println(number1 + " x " + number2 + " = ");
        int wynik = scannerWork.getInt(0, 1000);
        if ((number1 * number2) == wynik) {
            System.out.println();
            System.out.println("Wynik prawidłowy.");
            dzialaniaMatematyczne.setCorrectAnswer(1);
        } else {
            System.out.println();
            System.out.println("Wynik błędny.");
            dzialaniaMatematyczne.setIncorrectAnswer(1);
        }

        setLocalDateTimeEnd(dzialaniaMatematyczne);

        store.add(dzialaniaMatematyczne);
    }

    public void addByDivideing(List<DzialaniaMatematyczne> store) {
        DzialaniaMatematyczne dzialaniaMatematyczne = new DzialaniaMatematyczne();

        dzialaniaMatematyczne.setRodzajOperacji(RodzajOperacji.DZIELENIE);

        setLocalDateTimeStart(dzialaniaMatematyczne);

        System.out.println();
        System.out.println("PODZIEL LICZBĘ NR1 PRZEZ LICZBĘ NR2(wynik zaokrąglij do pełnej liczby):");
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(10) + 1;
        System.out.println("Liczba nr 1: " + number1);
        System.out.println("Liczba nr 2: " + number2);
        System.out.println(number1 + " : " + number2 + " = ");
        int wynik = scannerWork.getInt(0, 100);
        if ((number1 / number2) == wynik) {
            System.out.println();
            System.out.println("Wynik prawidłowy.");
            dzialaniaMatematyczne.setCorrectAnswer(1);
        } else {
            System.out.println();
            System.out.println("Wynik błędny.");
            dzialaniaMatematyczne.setIncorrectAnswer(1);
        }

        setLocalDateTimeEnd(dzialaniaMatematyczne);

        store.add(dzialaniaMatematyczne);
    }

    public void printScore(List<DzialaniaMatematyczne> store) {
        int correctAnswersSum = store.stream()
                .mapToInt(DzialaniaMatematyczne::getCorrectAnswer)
                .sum();

        int incorrectAnswersSum = store.stream()
                .mapToInt(DzialaniaMatematyczne::getIncorrectAnswer)
                .sum();

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Suma punktów: " + correctAnswersSum + "/" + (correctAnswersSum + incorrectAnswersSum) + ".");
    }

    public void printAverageTimeOfAdding(List<DzialaniaMatematyczne> store) {
        List<DzialaniaMatematyczne> listAdding = store.stream()
                .filter(dzialaniaMatematyczne -> dzialaniaMatematyczne.getRodzajOperacji().equals(RodzajOperacji.DODAWANIE))
                .collect(Collectors.toList());

        int timeAllOperations = getTimeAllOperations(listAdding);

        int averageTimeOfAdding = (timeAllOperations / listAdding.size());

        System.out.println("średni czas operacji dodawania: " + averageTimeOfAdding + " sekund.");
    }

    private int getTimeAllOperations(List<DzialaniaMatematyczne> list) {
        int timeAllOperations = 0;
        for (int i = 0; i < list.size(); i++) {
            Duration duration = Duration.between(list.get(i).getStart(), list.get(i).getEnd());
            timeAllOperations += duration.getSeconds();
        }
        return timeAllOperations;
    }

    public void printAverageTimeOfSubtracting(List<DzialaniaMatematyczne> store) {
        List<DzialaniaMatematyczne> listSubtracting = store.stream()
                .filter(dzialaniaMatematyczne -> dzialaniaMatematyczne.getRodzajOperacji().equals(RodzajOperacji.ODEJMOWANIE))
                .collect(Collectors.toList());

        int timeAllOperations = getTimeAllOperations(listSubtracting);

        int averageTimeOfAdding = (timeAllOperations / listSubtracting.size());

        System.out.println("średni czas operacji odejmowania: " + averageTimeOfAdding + " sekund.");
    }

    public void printAverageTimeOfMultiplying(List<DzialaniaMatematyczne> store) {
        List<DzialaniaMatematyczne> listMultiplying = store.stream()
                .filter(dzialaniaMatematyczne -> dzialaniaMatematyczne.getRodzajOperacji().equals(RodzajOperacji.MNOZENIE))
                .collect(Collectors.toList());

        int timeAllOperations = getTimeAllOperations(listMultiplying);

        int averageTimeOfAdding = (timeAllOperations / listMultiplying.size());

        System.out.println("średni czas operacji mnożenia: " + averageTimeOfAdding + " sekund.");
    }

    public void printAverageTimeOfDivideing(List<DzialaniaMatematyczne> store) {
        List<DzialaniaMatematyczne> listDivideing = store.stream()
                .filter(dzialaniaMatematyczne -> dzialaniaMatematyczne.getRodzajOperacji().equals(RodzajOperacji.DZIELENIE))
                .collect(Collectors.toList());

        int timeAllOperations = getTimeAllOperations(listDivideing);

        int averageTimeOfAdding = (timeAllOperations / listDivideing.size());

        System.out.println("średni czas operacji dzielenia: " + averageTimeOfAdding + " sekund.");
    }

    public void printAverage(List<DzialaniaMatematyczne> store) {
        printAverageTimeOfAdding(store);
        printAverageTimeOfSubtracting(store);
        printAverageTimeOfMultiplying(store);
        printAverageTimeOfDivideing(store);
    }
}
