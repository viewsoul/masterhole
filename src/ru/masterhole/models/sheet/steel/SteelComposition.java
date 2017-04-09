package ru.masterhole.models.sheet.steel;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 01.04.2017.
 */
public enum SteelComposition {
    BLACK("чёрная"),
    ZINC("оцинкованная"),
    STAINLESS("нержавеющая");

    private String title;

    SteelComposition(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;

    }

    public static String[] getTitles(){

        int elements = SteelComposition.values().length;
        String[] titles = new String[elements];

        for (SteelComposition steelComposition: SteelComposition.values()) {
            titles[steelComposition.ordinal()] = steelComposition.getTitle();
        }
        return titles;
    }

}
