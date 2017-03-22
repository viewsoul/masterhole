package ru.masterhole.ui;

import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class PanelMenu extends Panel {

    public PanelMenu() {
        this.getPanel().setSize(WIDTH_MENU,HEIGHT_MENU);
        this.getPanel().setPreferredSize(new Dimension(WIDTH_MENU,HEIGHT_MENU));
        this.getPanel().setBackground(Color.WHITE);
    }
}
