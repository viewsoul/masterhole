package ru.masterhole.ui.panel.input.field;

import ru.masterhole.ui.panel.input.field.component.ComponentList;
import ru.masterhole.ui.panel.input.field.component.ComponentText;
import ru.masterhole.ui.panel.input.field.label.LabelField;
import ru.masterhole.ui.panel.Panel;
import ru.masterhole.ui.panel.input.field.component.item.ItemsPanelInputFields;

import javax.swing.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public enum FieldsPanelInput implements ItemsPanelInputFields {
    SIZE(new LabelField("Размеры"), new ComponentList(ITEMS_SIZE)),
    LENGHT(new LabelField("Длина"), new ComponentText()),
    HEIGHT(new LabelField("Высота"), new ComponentText()),
    DEPTH(new LabelField("Глубина"), new ComponentText()),
    HEIGHT_TWO(new LabelField("Высота"), new ComponentText()),
    BULGE(new LabelField("Выпуклость"), new ComponentText()),
    RAMKA(new LabelField("Рамка"), new ComponentList(ITEMS_RAMKA)),
    RAMKA_ZALUZ(new LabelField("Рамка"), new ComponentList(ITEMS_RAMKA_ZALUZ)),
    RAMKA_SPOD(new LabelField("Рамка с подгибом"), new ComponentList(ITEMS_RAMKA_SPOD)),
    RAMKA_PLIT(new LabelField("Рамка плиточная"), new ComponentList(ITEMS_RAMKA_PLIT)),
    REBRO(new LabelField("Ребро"), new ComponentList(ITEMS_REBRO)),
    DOOR_TWO(new LabelField("Двухдверный"), new ComponentList(ITEMS_DOOR_TWO)),
    USILITEL(new LabelField("Усилитель"), new ComponentList(ITEMS_USILITEL)),
    SIDE_LEFT(new LabelField("Бок левый"), new ComponentList(ITEMS_SIDE_LEFT)),
    SIDE_RIGHT(new LabelField("Бок правый"), new ComponentList(ITEMS_SIDE_RIGHT)),
    PERFO(new LabelField("Перфорация"), new ComponentList(ITEMS_PERFO)),
    UGOLOK(new LabelField("Уголок"), new ComponentList(ITEMS_UGOLOK)),
    RADIUS(new LabelField("Радиус"), new ComponentList(ITEMS_RADIUS)),
    VIREZ(new LabelField("Вырезы"), new ComponentList(ITEMS_VIREZ)),
    HOLE(new LabelField("Отверстия"), new ComponentList(ITEMS_HOLE)),
    MAGNET(new LabelField("Магниты"), new ComponentList(ITEMS_MAGNET)),
    HANDLE(new LabelField("Мебельные ручки"), new ComponentList(ITEMS_HANDLE)),
    LOCK(new LabelField("Замки"), new ComponentList(ITEMS_LOCK)),
    MINILATCH(new LabelField("Нажимные механизмы"), new ComponentList(ITEMS_MINILATCH)),
    SHPINGALET(new LabelField("Шпингалеты"), new ComponentList(ITEMS_SHPINGALET)),
    UPOR(new LabelField("Упоры"), new ComponentList(ITEMS_UPOR)),
    GRUNT(new LabelField("Грунтовка"), new ComponentList(ITEMS_GRUNT)),
    COLOR(new LabelField("Цвет"), new ComponentList(ITEMS_COLOR)),
    OTHER_WORK(new LabelField("Дополнительные работы"), new ComponentText()),
    PACK(new LabelField("Упаковка"), new ComponentList(ITEMS_PACK)),
    MARGIN(new LabelField("Наценка"), new ComponentText());


    // надпись для лейбла
    private LabelField text;
    private JComponent component;

    FieldsPanelInput(LabelField text, JComponent component) {
        this.text = text;
        this.component = component;
    }

    public LabelField getText() {
        return text;
    }

    public JComponent getComponent() {
        return component;
    }

    public static void addFields(Panel panel) {
        for(FieldsPanelInput fieldsInput : FieldsPanelInput.values()){
            // добавить поле
            panel.getPanel().add(fieldsInput.getText());
            panel.getPanel().add(fieldsInput.getComponent());
        }
    }

    public static void setVisibleOff() {
        for(FieldsPanelInput fieldsInput : FieldsPanelInput.values()){
            // скрыть поле
            fieldsInput.getText().setVisible(false);
            fieldsInput.getComponent().setVisible(false);

        }
    }
}