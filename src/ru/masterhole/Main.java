package ru.masterhole;

import ru.masterhole.ui.FrameMain;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 20.03.2017.
 */
public class Main {

    public static void main (String[] args){

        // инициализация главного окна
        FrameMain frameMain = new FrameMain();

        // оптимизация размеров
        frameMain.pack();

    }
}
