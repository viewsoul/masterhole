package ru.masterhole.ui.panel.input.form;

import ru.masterhole.ui.panel.Panel;
import ru.masterhole.ui.panel.PanelsFrameMain;
import ru.masterhole.ui.panel.input.form.field.FieldsPanelInput;
import ru.masterhole.ui.panel.input.form.field.component.item.ItemsPanelInputFields;
import ru.masterhole.ui.panel.input.form.title.TitlesPanelInput;
import ru.masterhole.ui.panel.menu.button.ButtonsPanelMenu;

import javax.swing.*;

import static ru.masterhole.ui.panel.input.form.field.FieldsPanelInput.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 29.03.2017.
 */
public class FormsController implements FormsPattern,PanelsFrameMain,ItemsPanelInputFields {

    // получить шаблон формы ввода для нажатой кнопки
    public static void showForm(ButtonsPanelMenu button) {

        switch (button){
            case EKRAN:
                view(FORM_EKRAN);
                break;
            case RESH_PERFO:

                break;
            case RESH_PERFO_VSTR:
                view(FORM_RESH_PERFO_VSTR);
                setupSettingItems(button);
                break;
            case RESH_PERFO_NAKL:
                view(FORM_RESH_PERFO_NAKL);
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

        setupSettingItems(button);
    }

    private static void setupSettingItems(ButtonsPanelMenu buttonsPanelMenu) {

        switch (buttonsPanelMenu){
            case EKRAN:
                setSelectedText(SIDE_LEFT,TEXT_SIDE_NONE);
                setSelectedText(SIDE_RIGHT,TEXT_SIDE_NONE);
                setSelectedText(PERFO,TEXT_PERFO_RV);
                setSelectedText(RADIUS,TEXT_RADIUS);
                setSelectedValue(VIREZ,0);
                setSelectedValue(UPOR,0);
                setSelectedText(GRUNT,TEXT_GRUNT_NONE);
                setSelectedText(COLOR,TEXT_COLOR_WHITE);
                setSelectedText(PACK,TEXT_PACK_STRETCH);

                break;
            case RESH_PERFO:

                break;
            case RESH_PERFO_VSTR:
                setSelectedText(SIZE,TEXT_SIZE_POSADKA);
                setSelectedValue(RAMKA,15);
                setSelectedValue(REBRO,15);
                setSelectedText(PERFO,TEXT_PERFO_RV);
                setSelectedValue(VIREZ,0);
                setSelectedValue(HOLE,0);
                setSelectedText(GRUNT,TEXT_GRUNT_NONE);
                setSelectedText(COLOR,TEXT_COLOR_WHITE);
                setSelectedText(PACK,TEXT_PACK_STRETCH);
                break;
            case RESH_PERFO_NAKL:
                setSelectedText(PERFO,TEXT_PERFO_RV);
                break;
            case RESH_PERFO_PL:
                setSelectedText(PERFO,TEXT_PERFO_RV);
                break;
            case RESH_PERFO_PL_SPOD:
                setSelectedText(PERFO,TEXT_PERFO_RV);
                break;
            case RESH_PERFO_VIPKL:
                setSelectedText(PERFO,TEXT_PERFO_RV);
                break;
            case HATCH:

                break;
            case HATCH_VSTR:
                setSelectedText(SIZE,TEXT_SIZE_POSADKA);
                setSelectedText(RAMKA_SPOD,TEXT_RAMKA_SPOD_NONE);
                break;
            case HATCH_NAKL:
                break;
            case KOROB:
                break;
            case KOROB_G:
                break;
            case KOROB_P:
                break;
            case RESH_ZALUZ:
                break;
            case RESH_ZALUZ_VSTR:
                setSelectedText(SIZE,TEXT_SIZE_POSADKA);
                setSelectedValue(RAMKA,30);
                break;
            case RESH_ZALUZ_NAKL:
                break;
            case HATCH_PERFO:
                break;
            case HATCH_PERFO_VSTR:
                setSelectedText(SIZE,TEXT_SIZE_POSADKA);
                break;
            case HATCH_PERFO_NAKL:
                break;
        }
    }

    private static void setSelectedValue(FieldsPanelInput fieldList, int value) {
        ((JComboBox) fieldList.getComponent()).setSelectedItem(value);
    }

    private static void setSelectedText(FieldsPanelInput fieldList, String text) {
        ((JComboBox) fieldList.getComponent()).setSelectedItem(text);
    }

    // добавить заголовок на панель
    public static void add(Panel panel) {

        // заголовки
        for (TitlesPanelInput titlesPanelInput : TitlesPanelInput.values()){
            // добавить заголовок на панель
            panel.getPanel().add(titlesPanelInput.getLableTitle());
        }

        // поля
        for (FieldsPanelInput fieldsInput : FieldsPanelInput.values()){
            // добавить поле
            panel.getPanel().add(fieldsInput.getText());
            panel.getPanel().add(fieldsInput.getComponent());
        }

    }

    // показать только этот шаблон формы
    private static void view(FormPattern formPattern) {

        // отключить все поля и заголовки
        clear();

        // показать поля формы
        formPattern.setVisible();

        // обновить скролл
        PANEL_INPUT.updateScroll(formPattern.getHeightVisibleFields());
    }

    // очистить показаз заголовков и полей
    private static void clear() {
        // отключить заголовки
        TitlesPanelInput.setVisibleOff();

        // отключить все поля
        FieldsPanelInput.setVisibleOff();
//        System.out.println("контент очищен");
    }


}
