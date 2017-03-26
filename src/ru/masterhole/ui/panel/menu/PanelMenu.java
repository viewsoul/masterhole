package ru.masterhole.ui.panel.menu;

import ru.masterhole.ui.panel.menu.button.ButtonsPanelMenu;
import ru.masterhole.ui.panel.menu.button.SizePanelMenuButton;

import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class PanelMenu extends ru.masterhole.ui.panel.Panel implements SizePanelMenu, SizePanelMenuButton {

    public PanelMenu() {
        this.getPanel().setSize(WIDTH_MENU, HEIGHT_MENU);
        this.getPanel().setPreferredSize(new Dimension(WIDTH_MENU, HEIGHT_MENU));
        this.getPanel().setBackground(Color.WHITE);
        this.getPanel().setLayout(new FlowLayout(FlowLayout.LEFT,0, HEIGHT_BORDER_BUTTON_MENU));

        // добавить кнопки
        ButtonsPanelMenu.addButtons(this);

        // скролл
        this.updateScroll(ButtonsPanelMenu.getHeightVisibleButtons());
    }
}
