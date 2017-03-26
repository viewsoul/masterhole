package ru.masterhole.ui.panel.input;

import ru.masterhole.ui.panel.input.field.FieldsPanelInput;
import ru.masterhole.ui.panel.input.title.TitlesPanelInput;

import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class PanelInput extends ru.masterhole.ui.panel.Panel implements SizePanelInput {

    public PanelInput() {
        this.getPanel().setSize(WIDTH_INPUT, HEIGHT_INPUT);
        this.getPanel().setPreferredSize(new Dimension(WIDTH_INPUT, HEIGHT_INPUT));
        this.getPanel().setBackground(Color.LIGHT_GRAY);
        this.getPanel().setLayout(new FlowLayout(FlowLayout.LEFT,WIDTH_BORDER_INPUT, HEIGHT_BORDER_INPUT));

        // добавить заголовки
        TitlesPanelInput.addLabelTitle(this);

        // добавить поля контента
        FieldsPanelInput.addFields(this);

    }
}
