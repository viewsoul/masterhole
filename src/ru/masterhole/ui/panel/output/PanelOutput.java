package ru.masterhole.ui.panel.output;

import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class PanelOutput extends ru.masterhole.ui.panel.Panel implements SizePanelOutput {

    public PanelOutput() {
        this.getPanel().setSize(WIDTH_OUTPUT,HEIGHT_OUTPUT);
        this.getPanel().setPreferredSize(new Dimension(WIDTH_OUTPUT,HEIGHT_OUTPUT));
        this.getPanel().setBackground(Color.DARK_GRAY);
    }
}
