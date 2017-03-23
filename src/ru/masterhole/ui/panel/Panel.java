package ru.masterhole.ui.panel;

import ru.masterhole.ui.Constants;

import javax.swing.*;
import java.awt.*;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 20.03.2017.
 */
public abstract class Panel implements Constants {
    private JPanel panel;
    private JScrollPane scrollPane;

    public Panel() {
        this.panel = new JPanel();
        this.panel.setLayout(new FlowLayout());
        // инициализация скрола
        this.scrollPane = new JScrollPane(this.panel);
        // скрол только вертикальный
        this.scrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public JPanel getPanel() {
        return panel;
    }

    // обновить скролл по новой высоте панели
    public void updateScroll(int height){
        // текущая ширина панели
        int width = (int)panel.getPreferredSize().getWidth();
        panel.setPreferredSize(new Dimension(width,height));
    }
}
