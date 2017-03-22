package ru.masterhole.ui;

import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class ButtonProduct extends Button {

    public ButtonProduct(String text) {
        super(text);

        // устанавливаем цвет фона
        this.setBackground(new Color(74,130,187));

        // устанавливаем цвет текста
        this.setForeground(Color.white);
    }
}
