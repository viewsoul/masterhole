package ru.masterhole.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class ClickButtonsMenu implements ActionListener, Constants {

    @Override
    public void actionPerformed(ActionEvent e) {

        // инвертирвать видимость подразделов
        ButtonsMenu.reviewSubButtonsByHashCode(e.getSource().hashCode());

        // обновить скролл
        PANEL_MENU.updateScroll(ButtonsMenu.getHeightVisibleButtons());


    }

}