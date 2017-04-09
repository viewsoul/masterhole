package ru.masterhole.ui.panel.input.form.title;

import ru.masterhole.ui.panel.input.SizePanelInput;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public class TitleForm extends JLabel implements SizePanelInput {

    public TitleForm(String text) {
        super(text);
        this.setVisible(false);
        this.setPreferredSize(new Dimension(WIDTH_FILED_INPUT,HEIGHT_TITLE_INPUT));
        this.setFont(new Font(null,Font.BOLD,14));
    }
}
