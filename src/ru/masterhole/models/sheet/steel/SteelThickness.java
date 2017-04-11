package ru.masterhole.models.sheet.steel;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 07.04.2017.
 */
public enum SteelThickness {
    // в микрометрах
    THICKNESS_0_5(550),
    THICKNESS_0_7(700),
    THICKNESS_0_8(800),
    THICKNESS_1_0(1000),
    THICKNESS_1_2(1200),
    THICKNESS_1_5(1500),
    THICKNESS_2_0(2000);

    private int thickness;

    SteelThickness(int thickness) {
        this.thickness = thickness;
    }

    public int getThickness() {
        return thickness;
    }

    public String getTitle(){
        return (float)thickness/1000+" мм";
    }

    public static String[] getTitles(){

        int elements = SteelThickness.values().length;
        String[] titles = new String [elements];

        for (SteelThickness steelThickness : SteelThickness.values()) {
            titles[steelThickness.ordinal()] = (float)steelThickness.getThickness()/1000+" мм";
        }
        return titles;
    }
}
