package ru.masterhole.models.sheet.steel;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 10.04.2017.
 */
public enum SteelPerfo {
    RV_3_5("круг Rv 3-5"),
    QG_5_8("квадрат Qg 5-8"),
    QG_10_14("квадрат Qg 10-14"),
    QG_3_5("квадрат Qg 3-5"),
    NR_152("цветок Nr. 152");

    private String title;

    SteelPerfo(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static String[] getTitles(){

        int elements = SteelPerfo.values().length;
        String[] titles = new String[elements];

        for (SteelPerfo steelPerfo: SteelPerfo.values()) {
            titles[steelPerfo.ordinal()] = steelPerfo.getTitle();
        }
        return titles;
    }
}
