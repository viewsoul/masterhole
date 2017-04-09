package ru.masterhole.models.sheet.steel;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 10.04.2017.
 */
public enum SteelPerfo {
    RV_3_5("круг"),
    QG_5_8("5-8"),
    QG_10_14("10-14"),
    QG_3_5("3-5"),
    NR_152("цветок");

    private String title;

    SteelPerfo(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
