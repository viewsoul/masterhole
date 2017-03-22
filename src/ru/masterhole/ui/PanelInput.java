package ru.masterhole.ui;

import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class PanelInput extends Panel {

    public PanelInput() {
        this.getPanel().setSize(WIDTH_INPUT,HEIGHT_INPUT);
        this.getPanel().setPreferredSize(new Dimension(WIDTH_INPUT,HEIGHT_INPUT));
        this.getPanel().setBackground(Color.LIGHT_GRAY);
    }
}
