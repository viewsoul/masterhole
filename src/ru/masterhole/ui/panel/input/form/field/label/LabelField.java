package ru.masterhole.ui.panel.input.form.field.label;

import ru.masterhole.ui.panel.input.SizePanelInput;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public class LabelField extends JLabel implements SizePanelInput {
    public LabelField(String text) {
        super(text);
        this.setPreferredSize(new Dimension(WIDTH_HALF_FIELD_INPUT,HEIGHT_FIELD_INPUT));
        this.setFont(new Font(null,Font.BOLD,12));
//        this.setOpaque(true);
//        this.setBackground(Color.GRAY);

        this.setVisible(false);
    }
}
