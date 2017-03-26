package ru.masterhole.ui.panel.input.form;

import ru.masterhole.ui.panel.input.field.FieldsPanelInput;
import ru.masterhole.ui.panel.input.title.TitlesPanelInput;

import java.util.ArrayList;
import java.util.List;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public class FormPattern {

    private TitlesPanelInput title;
    private List<FieldsPanelInput> list;

    public FormPattern(TitlesPanelInput titlesPanelInput,FieldsPanelInput[] fieldsPanelInput) {

        // заголовок
        this.title = titlesPanelInput;
        System.out.println("иниц. заголовка "+titlesPanelInput.getLableTitle().getText());

        // поля
        this.list = new ArrayList<>();
        for(int i=0; i<fieldsPanelInput.length; i++){
            this.list.add(fieldsPanelInput[i]);
//            System.out.println("инициализация поля "+fieldsPanelInput[i]);
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
}
