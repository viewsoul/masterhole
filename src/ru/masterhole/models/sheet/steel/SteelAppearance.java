package ru.masterhole.models.sheet.steel;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 09.04.2017.
 */
public enum SteelAppearance {
    GLUH("глухой"),
    PERFO("перфорированный");

    private String perfo;

    SteelAppearance(String perfo) {
        this.perfo = perfo;
    }

    public String getPerfo() {
        return perfo;
    }

    public void setPerfo(String perfo) {
        this.perfo = perfo;
    }
}
