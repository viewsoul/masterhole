package ru.masterhole.ui.frame;

import ru.masterhole.ui.Constants;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 20.03.2017.
 */
public class Frame extends JFrame implements Constants {

    public Frame() {
        // заголовок окна
        this.setTitle("Прайс-лист");

        // размеры окна
        this.setPreferredSize(new Dimension(WIDTH_WINDOW,HEIGHT_WINDOW));
        this.setMinimumSize(new Dimension(WIDTH_WINDOW,HEIGHT_WINDOW));

        // схема расположения элементов на фрейме
        this.setLayout(new BorderLayout());

        // действие по кнопке крестик
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // размещение окна в центре экрана
        this.setLocationRelativeTo(null);

        // отобразить окно
        this.setVisible(true);
    }
}
