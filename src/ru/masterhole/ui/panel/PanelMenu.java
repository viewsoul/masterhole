package ru.masterhole.ui.panel;

import ru.masterhole.ui.ButtonsMenu;
import ru.masterhole.ui.Constants;

import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class PanelMenu extends Panel {

    public PanelMenu() {
        this.getPanel().setSize(Constants.WIDTH_MENU, Constants.HEIGHT_MENU);
        this.getPanel().setPreferredSize(new Dimension(Constants.WIDTH_MENU, Constants.HEIGHT_MENU));
        this.getPanel().setBackground(Color.WHITE);
        this.getPanel().setLayout(new FlowLayout(FlowLayout.LEFT,0, Constants.HEIGHT_BORDER_BUTTON_MENU));

        // добавить кнопки
        ButtonsMenu.addButtons(this);

        // скролл
        this.updateScroll(ButtonsMenu.getHeightVisibleButtons());
    }
}
