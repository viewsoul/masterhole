package ru.masterhole.ui.frame;

import ru.masterhole.ui.panel.PanelInput;
import ru.masterhole.ui.panel.PanelMenu;
import ru.masterhole.ui.panel.PanelOutput;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 23.03.2017.
 */
public class FrameMain extends Frame {

    // коробка для панелей ввода и вывода
    private JPanel panelContent;

    public FrameMain() {
        super();
        this.panelContent = new JPanel();
        this.panelContent.setLayout(new BorderLayout());

        // добавление панели меню на главное окно
        this.add(PANEL_MENU.getScrollPane(),BorderLayout.WEST);

        // добавление коробки на главное окно
        this.add(this.panelContent,BorderLayout.CENTER);

        // добавление панелей ввода и вывода на панель-коробку
        this.panelContent.add(PANEL_INPUT.getScrollPane(),BorderLayout.WEST);
        this.panelContent.add(PANEL_OUTPUT.getScrollPane(),BorderLayout.CENTER);
    }

    public PanelMenu getPanelMenu() {
        return PANEL_MENU;
    }

    public PanelInput getPanelInput() {
        return PANEL_INPUT;
    }

    public PanelOutput getPanelOutput() {
        return PANEL_OUTPUT;
    }
}
