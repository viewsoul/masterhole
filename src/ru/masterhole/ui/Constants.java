package ru.masterhole.ui;

import ru.masterhole.ui.panel.PanelInput;
import ru.masterhole.ui.panel.PanelMenu;
import ru.masterhole.ui.panel.PanelOutput;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public interface Constants {

    int WIDTH_WINDOW = 800;
    int WIDTH_MENU = 220;
    int WIDTH_INPUT = 440;
    int WIDTH_OUTPUT = -1;

    int HEIGHT_WINDOW = 400;
    int HEIGHT_MENU = -1;
    int HEIGHT_INPUT = -1;
    int HEIGHT_OUTPUT = -1;

    int WIDTH_BUTTON_MENU = 220;
    int HEIGHT_BUTTON_MENU = 33;
    int HEIGHT_BORDER_BUTTON_MENU = 2;

    PanelMenu PANEL_MENU = new PanelMenu();
    PanelInput PANEL_INPUT = new PanelInput();
    PanelOutput PANEL_OUTPUT = new PanelOutput();

}
