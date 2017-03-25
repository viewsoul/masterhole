package ru.masterhole.ui.panel.input;

import ru.masterhole.ui.panel.input.field.FieldsPanelInput;
import ru.masterhole.ui.panel.input.field.SizeField;

import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class PanelInput extends ru.masterhole.ui.panel.Panel implements SizePanelInput, SizeField {

    public PanelInput() {
        this.getPanel().setSize(WIDTH_INPUT, HEIGHT_INPUT);
        this.getPanel().setPreferredSize(new Dimension(WIDTH_INPUT, HEIGHT_INPUT));
        this.getPanel().setBackground(Color.LIGHT_GRAY);
        this.getPanel().setLayout(new FlowLayout(FlowLayout.LEFT,0, HEIGHT_BORDER_FIELD_INPUT));

        // добавить поля контента
        FieldsPanelInput.addFields(this);

    }
}
