package ru.masterhole;

import ru.masterhole.ui.*;
import ru.masterhole.ui.Frame;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 20.03.2017.
 */
public class Main {

    public static void main (String[] args){

        // инициализация главного окна
        Frame frameMain = new Frame();

        // инициализация панелей
        PanelMenu panelMenu = new PanelMenu();
        PanelInput panelInput = new PanelInput();
        PanelOutput panelOutput = new PanelOutput();

        // инициализация панели-коробки для размещения панели ввода и вывода
        JPanel panelContent = new JPanel();
        // макет расположения
        panelContent.setLayout(new BorderLayout());

        // добавление панели меню на главное окно
        frameMain.add(panelMenu.getScrollPane(),BorderLayout.WEST);
        // добавление коробки на главное окно
        frameMain.add(panelContent,BorderLayout.CENTER);

        // добавление панелей ввода и вывода на панель-коробку
        panelContent.add(panelInput.getScrollPane(),BorderLayout.WEST);
        panelContent.add(panelOutput.getScrollPane(),BorderLayout.CENTER);

        // добавление кнопок в меню
        Buttons.add(panelMenu);

        // скролл
        panelMenu.updateScroll(Buttons.getHeightVisibleButtons());

        // оптимизация размеров
        frameMain.pack();

    }
}
