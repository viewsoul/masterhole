package ru.masterhole.ui.panel.input;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public interface SizePanelInput {

    int WIDTH_INPUT = 400;
    int HEIGHT_INPUT = -1;

    // отступы вокруг поля
    int HEIGHT_BORDER_INPUT = 2;
    int WIDTH_BORDER_INPUT = 8;

    // размеры полей
    int HEIGHT_FIELD_INPUT = 33;
    int WIDTH_FILED_INPUT = WIDTH_INPUT - 2*WIDTH_BORDER_INPUT;
    int WIDTH_HALF_FIELD_INPUT = (WIDTH_FILED_INPUT-WIDTH_BORDER_INPUT)/2;

}
