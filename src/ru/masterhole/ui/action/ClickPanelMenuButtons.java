package ru.masterhole.ui.action;

import ru.masterhole.ui.panel.PanelsFrameMain;
import ru.masterhole.ui.panel.menu.button.ButtonsPanelMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class ClickPanelMenuButtons implements ActionListener, PanelsFrameMain {

    @Override
    public void actionPerformed(ActionEvent e) {

        // инвертирвать видимость подразделов
        ButtonsPanelMenu.reviewSubButtonsByHashCode(e.getSource().hashCode());

        // обновить скролл панели меню
        PANEL_MENU.updateScroll(ButtonsPanelMenu.getHeightVisibleButtons());


    }

}