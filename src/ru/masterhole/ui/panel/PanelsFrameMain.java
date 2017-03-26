package ru.masterhole.ui.panel;

import ru.masterhole.ui.panel.input.PanelInput;
import ru.masterhole.ui.panel.menu.PanelMenu;
import ru.masterhole.ui.panel.output.PanelOutput;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public interface PanelsFrameMain {
    PanelMenu PANEL_MENU = new PanelMenu();
    PanelInput PANEL_INPUT = new PanelInput();
    PanelOutput PANEL_OUTPUT = new PanelOutput();
}
