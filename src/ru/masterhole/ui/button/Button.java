package ru.masterhole.ui.button;

import ru.masterhole.ui.ClickButtonsMenu;
import ru.masterhole.ui.Constants;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public abstract class Button extends JButton implements Constants {

    public Button(String text) {

        this.setText(text);

        // устанавливаем размер кнопок
        this.setPreferredSize(new Dimension(WIDTH_BUTTON_MENU,HEIGHT_BUTTON_MENU));

        // меняем курсор на сфокусированной кнопке
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // отключаем фокус с нажатой кнопки
        this.setFocusPainted(false);

        // отключаем обводки кнопок
        this.setBorderPainted(false);

        // показать кнопку
        this.setVisible(true);

        // слушатель клика по кнопке
        this.addActionListener(new ClickButtonsMenu());
    }

}
