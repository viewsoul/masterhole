package ru.masterhole.models.color;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 06.04.2017.
 */
public enum Colors {
    WHITE("белый"),
    COLOR("цветной"),
    MATE_WHITE("белый матовый"),
    MATE_COLOR("белый матовый"),
    ANTIK("антик"),
    METALIC("металлик"),
    CHROM("хром"),
    GOLD("золото");

    private String name;

    Colors(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
