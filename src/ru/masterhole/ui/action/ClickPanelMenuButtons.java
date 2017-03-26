package ru.masterhole.ui.action;

import ru.masterhole.ui.panel.PanelsFrameMain;
import ru.masterhole.ui.panel.input.field.FieldsPanelInput;
import ru.masterhole.ui.panel.input.form.FormPattern;
import ru.masterhole.ui.panel.input.form.FormsPattern;
import ru.masterhole.ui.panel.input.title.TitlesPanelInput;
import ru.masterhole.ui.panel.menu.button.ButtonsPanelMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 21.03.2017.
 */
public class ClickPanelMenuButtons implements ActionListener, PanelsFrameMain, FormsPattern {

    @Override
    public void actionPerformed(ActionEvent e) {

        // хэшкод нажатой кнопки
        int butHash = e.getSource().hashCode();

        // инвертирвать видимость подразделов
        ButtonsPanelMenu.reviewSubButtonsByHashCode(butHash);

        // обновить скролл панели меню
        PANEL_MENU.updateScroll(ButtonsPanelMenu.getHeightVisibleButtons());

        // выбрать форму для панели ввода
        getFormPattern(ButtonsPanelMenu.getSource(butHash));

        }

    // показать шаблон формы ввода для нажатой кнопки
    @Override
    public void getFormPattern(ButtonsPanelMenu button) {
        switch (button){
            case EKRAN:
                view(FORM_EKRAN);
                break;
            case RESH_PERFO:

                break;
            case RESH_PERFO_VSTR:
                view(FORM_RESH_PERFO_VSTR);
                break;
            case RESH_PERFO_NAKL:
                view(FORM_HATCH_PERFO_NAKL);
                break;
            case RESH_PERFO_PL:
                view(FORM_RESH_PERFO_PL);
                break;
            case RESH_PERFO_PL_SPOD:
                view(FORM_RESH_PERFO_PL_SPOD);
                break;
            case RESH_PERFO_VIPKL:
                view(FORM_RESH_PERFO_VIPKL);
                break;
            case HATCH:

                break;
            case HATCH_VSTR:
                view(FORM_HATCH_VSTR);
                break;
            case HATCH_NAKL:
                view(FORM_HATCH_NAKL);
                break;
            case KOROB:

                break;
            case KOROB_G:
                view(FORM_KOROB_G);
                break;
            case KOROB_P:
                view(FORM_KOROB_P);
                break;
            case RESH_ZALUZ:

                break;
            case RESH_ZALUZ_VSTR:
                view(FORM_RESH_ZALUZ_VSTR);
                break;
            case RESH_ZALUZ_NAKL:
                view(FORM_RESH_ZALUZ_NAKL);
                break;
            case HATCH_PERFO:

                break;
            case HATCH_PERFO_VSTR:
                view(FORM_HATCH_PERFO_VSTR);
                break;
            case HATCH_PERFO_NAKL:
                view(FORM_HATCH_PERFO_NAKL);
                break;
        }
    }

    // показать только этот шаблон формы
    private void view(FormPattern formPattern) {
        // отключить все поля и заголовки
        clear();

        // показать поля формы
        formPattern.setVisible();
    }

    // очистить показаз заголовков и полей
    private void clear() {
        // отключить заголовки
        TitlesPanelInput.setVisibleOff();

        // отключить все поля
        FieldsPanelInput.setVisibleOff();
//        System.out.println("контент очищен");
    }
}