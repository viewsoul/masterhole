package ru.masterhole.models.sheet.steel;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 09.04.2017.
 */
public enum SteelAppearance {
    GLUH("глухой"),
    PERFO("перфорированный");

    private String title;

    SteelAppearance(String perfo) {
        this.title = perfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String[] getTitles(){

        int elements = SteelAppearance.values().length;
        String[] titles = new String[elements];

        for (SteelAppearance steelAppearance: SteelAppearance.values()) {
            titles[steelAppearance.ordinal()] = steelAppearance.getTitle();
        }
        return titles;
    }
}
