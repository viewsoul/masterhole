package ru.masterhole.ui.panel;

import ru.masterhole.ui.Constants;

import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class PanelInput extends Panel {

    public PanelInput() {
        this.getPanel().setSize(Constants.WIDTH_INPUT, Constants.HEIGHT_INPUT);
        this.getPanel().setPreferredSize(new Dimension(Constants.WIDTH_INPUT, Constants.HEIGHT_INPUT));
        this.getPanel().setBackground(Color.LIGHT_GRAY);
    }
}
