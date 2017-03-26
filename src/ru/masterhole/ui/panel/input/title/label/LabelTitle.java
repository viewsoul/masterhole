package ru.masterhole.ui.panel.input.title.label;

import ru.masterhole.ui.panel.input.SizePanelInput;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public class LabelTitle extends JLabel implements SizePanelInput {

    public LabelTitle(String text) {
        super(text);
        this.setPreferredSize(new Dimension(WIDTH_FILED_INPUT,HEIGHT_FIELD_INPUT*2));
        this.setFont(new Font(null,Font.BOLD,14));
//        this.setOpaque(true); // прозрачность
//        this.setBackground(Color.GRAY); // цвет фона

    }
}
