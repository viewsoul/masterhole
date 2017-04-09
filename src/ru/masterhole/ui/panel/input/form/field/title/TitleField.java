package ru.masterhole.ui.panel.input.form.field.title;

import ru.masterhole.ui.panel.input.SizePanelInput;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public class TitleField extends JLabel implements SizePanelInput {
    public TitleField(String text) {
        super(text);
        this.setPreferredSize(new Dimension(WIDTH_HALF_FIELD_INPUT,HEIGHT_FIELD_INPUT));
        this.setFont(new Font(null,Font.BOLD,12));
        this.setVisible(false);
    }
}
