package ru.masterhole.ui.panel.menu.button;

import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class ButtonProduct extends ru.masterhole.ui.panel.menu.button.Button implements SizePanelMenuButton {

    public ButtonProduct(String text) {
        super(text);

        // устанавливаем размер кнопок
        this.setPreferredSize(new Dimension(WIDTH_BUTTON_MENU,HEIGHT_BUTTON_MENU));

        // устанавливаем цвет фона
        this.setBackground(new Color(74,130,187));

        // устанавливаем цвет текста
        this.setForeground(Color.white);
    }
}
