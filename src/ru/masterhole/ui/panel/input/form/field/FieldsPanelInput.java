package ru.masterhole.ui.panel.input.form.field;

import ru.masterhole.ui.panel.input.form.field.component.ComponentListInt;
import ru.masterhole.ui.panel.input.form.field.component.ComponentListStr;
import ru.masterhole.ui.panel.input.form.field.component.ComponentText;
import ru.masterhole.ui.panel.input.form.field.label.LabelField;
import ru.masterhole.ui.panel.input.form.field.component.item.ItemsPanelInputFields;

import javax.swing.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public enum FieldsPanelInput implements ItemsPanelInputFields {

    SIZE(new LabelField("Размеры"), new ComponentListStr(ITEMS_SIZE)),
    LENGHT(new LabelField("Длина"), new ComponentText()),
    HEIGHT(new LabelField("Высота"), new ComponentText()),
    DEPTH(new LabelField("Глубина"), new ComponentText()),
    HEIGHT_TWO(new LabelField("Высота"), new ComponentText()),
    BULGE(new LabelField("Выпуклость"), new ComponentText()),
    RAMKA(new LabelField("Рамка"), new ComponentListInt(ITEMS_RAMKA)),
    RAMKA_ZALUZ(new LabelField("Рамка"), new ComponentListInt(ITEMS_RAMKA_ZALUZ)),
    RAMKA_SPOD(new LabelField("Рамка с подгибом"), new ComponentListStr(ITEMS_RAMKA_SPOD)),
    RAMKA_PLIT(new LabelField("Рамка плиточная"), new ComponentListStr(ITEMS_RAMKA_PLIT)),
    REBRO(new LabelField("Ребро"), new ComponentListInt(ITEMS_REBRO)),
    DOOR_TWO(new LabelField("Двухдверный"), new ComponentListStr(ITEMS_DOOR_TWO)),
    USILITEL(new LabelField("Усилитель"), new ComponentListInt(ITEMS_USILITEL)),
    SIDE_LEFT(new LabelField("Бок левый"), new ComponentListStr(ITEMS_SIDE_LEFT)),
    SIDE_RIGHT(new LabelField("Бок правый"), new ComponentListStr(ITEMS_SIDE_RIGHT)),
    PERFO(new LabelField("Перфорация"), new ComponentListStr(ITEMS_PERFO)),
    UGOLOK(new LabelField("Уголок"), new ComponentListStr(ITEMS_UGOLOK)),
    RADIUS(new LabelField("Радиус"), new ComponentListStr(ITEMS_RADIUS)),
    VIREZ(new LabelField("Вырезы"), new ComponentListInt(ITEMS_VIREZ)),
    HOLE(new LabelField("Отверстия"), new ComponentListInt(ITEMS_HOLE)),
    MAGNET(new LabelField("Магниты"), new ComponentListInt(ITEMS_MAGNET)),
    HANDLE(new LabelField("Мебельные ручки"), new ComponentListInt(ITEMS_HANDLE)),
    LOCK(new LabelField("Замки"), new ComponentListInt(ITEMS_LOCK)),
    MINILATCH(new LabelField("Нажимные механизмы"), new ComponentListInt(ITEMS_MINILATCH)),
    SHPINGALET(new LabelField("Шпингалеты"), new ComponentListInt(ITEMS_SHPINGALET)),
    UPOR(new LabelField("Упоры"), new ComponentListInt(ITEMS_UPOR)),
    GRUNT(new LabelField("Грунтовка"), new ComponentListStr(ITEMS_GRUNT)),
    COLOR(new LabelField("Цвет"), new ComponentListStr(ITEMS_COLOR)),
    OTHER_WORK(new LabelField("Дополнительные работы"), new ComponentText()),
    PACK(new LabelField("Упаковка"), new ComponentListStr(ITEMS_PACK)),
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

    public static void setVisibleOff() {
        for(FieldsPanelInput fieldsInput : FieldsPanelInput.values()){
            // скрыть поле
            fieldsInput.getText().setVisible(false);
            fieldsInput.getComponent().setVisible(false);

        }
    }
}