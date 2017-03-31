package ru.masterhole.ui.panel.input.form;

import ru.masterhole.ui.panel.input.SizePanelInput;
import ru.masterhole.ui.panel.input.form.field.FieldsPanelInput;
import ru.masterhole.ui.panel.input.form.title.TitlesPanelInput;

import java.util.ArrayList;
import java.util.List;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public class FormPattern implements SizePanelInput {

    private TitlesPanelInput title;
    private List<FieldsPanelInput> list;

    public FormPattern(TitlesPanelInput titlesPanelInput,FieldsPanelInput[] fieldsPanelInput) {

        // заголовок
        this.title = titlesPanelInput;

        // поля
        this.list = new ArrayList<>();
        for(int i=0; i<fieldsPanelInput.length; i++){
            this.list.add(fieldsPanelInput[i]);
        }

    }

    // показать поля
    public void setVisible() {

        // показать заголовок
        this.title.getLableTitle().setVisible(true);

        // показать все поля
        for (FieldsPanelInput fieldsPanelInput : list){
            // показать название поля
            fieldsPanelInput.getText().setVisible(true);
            // показать компонент поля
            fieldsPanelInput.getComponent().setVisible(true);
        }
    }

    // количество видимых полей
    private int getCountFields(){
        return this.list.size();
    }

    // высота видимых полей
    public int getHeightVisibleFields(){
        return HEIGHT_TITLE_INPUT + HEIGHT_BORDER_INPUT +
                (HEIGHT_BORDER_INPUT + HEIGHT_FIELD_INPUT)*getCountFields() + HEIGHT_BORDER_INPUT;
    }
}
