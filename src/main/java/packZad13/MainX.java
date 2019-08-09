package packZad13;

import java.time.Duration;
import java.time.LocalDateTime;

public class MainX {
    public static void main(String[] args) {
        System.out.println();

        LocalDateTime timeStart = LocalDateTime.now();
        System.out.println(timeStart);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalDateTime timeEnd = LocalDateTime.now();
        System.out.println(timeEnd);
        int different = timeEnd.getSecond() - timeStart.getSecond();
        System.out.println(different);

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println("duration: " + duration.getSeconds());
    }
}
