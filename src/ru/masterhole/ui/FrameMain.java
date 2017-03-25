package ru.masterhole.ui;

import ru.masterhole.ui.panel.PanelsFrameMain;
import ru.masterhole.ui.panel.input.PanelInput;
import ru.masterhole.ui.panel.menu.PanelMenuButton;
import ru.masterhole.ui.panel.output.PanelOutput;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 23.03.2017.
 */
public class FrameMain extends JFrame implements PanelsFrameMain, SizeFrameMain {

    // коробка для панелей ввода и вывода
    private JPanel panelContent;

    public FrameMain() {

        // заголовок окна
        this.setTitle("Прайс-лист");

        // действие по кнопке крестик
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // схема расположения элементов на фрейме
        this.setLayout(new BorderLayout());

        // размеры окна
        this.setPreferredSize(new Dimension(WIDTH_WINDOW,HEIGHT_WINDOW));
        this.setMinimumSize(new Dimension(WIDTH_WINDOW,HEIGHT_WINDOW));

        this.panelContent = new JPanel();
        this.panelContent.setLayout(new BorderLayout());

        // добавление панели меню на главное окно
        this.add(PANEL_MENU.getScrollPane(),BorderLayout.WEST);

        // добавление коробки на главное окно
        this.add(this.panelContent,BorderLayout.CENTER);

        // добавление панелей ввода и вывода на панель-коробку
        this.panelContent.add(PANEL_INPUT.getScrollPane(),BorderLayout.WEST);
        this.panelContent.add(PANEL_OUTPUT.getScrollPane(),BorderLayout.CENTER);

        // размещение окна в центре экрана
        this.setLocationRelativeTo(null);

        // отобразить окно
        this.setVisible(true);

    }

    public PanelMenuButton getPanelMenu() {
        return PANEL_MENU;
    }

    public PanelInput getPanelInput() {
        return PANEL_INPUT;
    }

    public PanelOutput getPanelOutput() {
        return PANEL_OUTPUT;
    }
}
