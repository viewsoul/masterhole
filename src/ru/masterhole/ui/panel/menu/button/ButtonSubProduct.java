package ru.masterhole.ui.panel.menu.button;

import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class ButtonSubProduct extends Button implements SizePanelMenuButton {

    public ButtonSubProduct(String text) {
        super(text);

        // устанавливаем размер кнопок
        this.setPreferredSize(new Dimension(WIDTH_BUTTON_MENU,HEIGHT_BUTTON_MENU));

        // устанавливаем цвет фона
        this.setBackground(new Color(220,222,225));

        // устанавливаем цвет текста
        this.setForeground(new Color(50,50,50));

        // скрыть или показать кнопку
        this.setVisible(false);
    }
}
