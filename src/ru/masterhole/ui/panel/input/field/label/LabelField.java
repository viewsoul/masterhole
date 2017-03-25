package ru.masterhole.ui.panel.input.field.label;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public class LabelField extends JLabel implements SizeLabelField {
    public LabelField(String text) {
        super(text);
        this.setPreferredSize(new Dimension(WIDTH_LABEL_FIELD,HEIGHT_LABEL_FIELD));
        this.setFont(new Font(null,Font.BOLD,12));
    }
}
