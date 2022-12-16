package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        System.out.println("Podaj porę roku:");
        for (Season value : Season.values()) {
            System.out.println(value.getTranslation());
        }

        String unserInput = scanner.nextLine();
        Season userSeason = Season.getSeasonByTranslation(unserInput);

        System.out.println("W tej porze roku są następujące miesiące:");
        System.out.println(Arrays.toString(userSeason.getMonths()));
    }

}
