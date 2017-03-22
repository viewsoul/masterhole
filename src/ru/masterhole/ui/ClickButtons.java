package ru.masterhole.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class ClickButtons implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        // инвертирвать видимость подразделов
        Buttons.setVisibleByHashCode(e.getSource().hashCode());

        // добавить скролл

    }

}