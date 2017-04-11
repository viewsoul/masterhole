package ru.masterhole.ui.panel.menu.button;

import ru.masterhole.ui.panel.menu.action.ClickPanelMenuButtons;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public abstract class Button extends JButton {

    public Button(String text) {

        this.setText(text);

        // меняем курсор на сфокусированной кнопке
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // отключаем фокус с нажатой кнопки
        this.setFocusPainted(false);

        // отключаем обводки кнопок
        this.setBorderPainted(false);

        // показать кнопку
        this.setVisible(true);

        // слушатель клика по кнопке
        this.addActionListener(new ClickPanelMenuButtons());
    }

}
