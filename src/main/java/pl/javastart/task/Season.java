package pl.javastart.task;

import java.util.Arrays;

public enum Season {
    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("Zima", new String[]{"grudzień", "styczeń", "luty"});

    private String translation;
    private String [] months;

    Season(String translation, String[] months) {
        this.translation = translation;
        this.months = months;
    }

    public static Season getSeasonByTranslation(String translation) {
        for (Season value : values()) {
            if (value.translation.equalsIgnoreCase(translation)) {
                return value;
            }
        }
        return null;
    }

    public String getTranslation() {
        return translation;
    }

    public String[] getMonths() {
        return months;
    }
}