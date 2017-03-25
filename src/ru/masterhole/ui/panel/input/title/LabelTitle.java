package ru.masterhole.ui.panel.input.title;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public class LabelTitle extends JLabel implements SizeLabelTitle {

    public LabelTitle(String text) {
        super(text);
        this.setPreferredSize(new Dimension(WIDTH_LABEL_TITLE,HEIGHT_LABEL_TITLE));
        this.setFont(new Font(null,Font.BOLD,18));
    }
}
