package ru.masterhole.ui.panel.menu.action;

import ru.masterhole.ui.panel.PanelsFrameMain;
import ru.masterhole.ui.panel.input.form.FormsController;
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

        // хэшкод нажатой кнопки
        int butHash = e.getSource().hashCode();
        // нажатая кнопка
        ButtonsPanelMenu button = ButtonsPanelMenu.getSource(butHash);

        // инвертирвать видимость подразделов в меню
        ButtonsPanelMenu.reviewSubButtonsByHashCode(butHash);
        // обновить скролл панели меню
        PANEL_MENU.updateScroll(ButtonsPanelMenu.getHeightVisibleButtons());

        // показать форму панели ввода по нажатию кнопки
        FormsController.showForm(button);

        }


}