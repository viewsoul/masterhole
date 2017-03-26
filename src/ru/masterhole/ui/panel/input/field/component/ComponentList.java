package ru.masterhole.ui.panel.input.field.component;

import ru.masterhole.ui.panel.input.SizePanelInput;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 27.03.2017.
 */
public class ComponentList extends JComboBox implements SizePanelInput {

    public ComponentList(Object[] items) {
        super(items);
        // скрыть
        this.setVisible(false);
        // установить рамеры компонента
        this.setPreferredSize(new Dimension(WIDTH_HALF_FIELD_INPUT,HEIGHT_FIELD_INPUT));
    }
}
