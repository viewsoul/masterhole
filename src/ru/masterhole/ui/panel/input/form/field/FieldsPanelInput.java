package ru.masterhole.ui.panel.input.form.field;

import ru.masterhole.models.sheet.steel.SteelComposition;
import ru.masterhole.ui.panel.input.form.field.component.ValueSelect;
import ru.masterhole.ui.panel.input.form.field.component.TextSelect;
import ru.masterhole.ui.panel.input.form.field.component.ValueInput;
import ru.masterhole.ui.panel.input.form.field.title.TitleField;
import ru.masterhole.ui.panel.input.form.field.component.item.ItemsFieldsPanelInput;

import javax.swing.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public enum FieldsPanelInput implements ItemsFieldsPanelInput {

    SIZE(new TitleField("Размеры"), new TextSelect(ITEMS_SIZE)),
    LENGHT(new TitleField("Длина"), new ValueInput()),
    HEIGHT(new TitleField("Высота"), new ValueInput()),
    DEPTH(new TitleField("Глубина"), new ValueInput()),
    HEIGHT_TWO(new TitleField("Высота"), new ValueInput()),
    BULGE(new TitleField("Выпуклость"), new ValueInput()),
    SHEET_COMPOSITION(new TitleField("Сталь"), new TextSelect(SteelComposition.getTitles())),
    RAMKA(new TitleField("Рамка"), new ValueSelect(ITEMS_RAMKA)),
    RAMKA_ZALUZ(new TitleField("Рамка"), new ValueSelect(ITEMS_RAMKA_ZALUZ)),
    RAMKA_SPOD(new TitleField("Рамка с подгибом"), new TextSelect(ITEMS_RAMKA_SPOD)),
    RAMKA_PLIT(new TitleField("Рамка плиточная"), new TextSelect(ITEMS_RAMKA_PLIT)),
    REBRO(new TitleField("Ребро"), new ValueSelect(ITEMS_REBRO)),
    DOOR_TWO(new TitleField("Количество дверей"), new TextSelect(ITEMS_DOOR_TWO)),
    USILITEL(new TitleField("Усилитель"), new ValueSelect(ITEMS_USILITEL)),
    SIDE_LEFT(new TitleField("Бок левый"), new TextSelect(ITEMS_SIDE_LEFT)),
    SIDE_RIGHT(new TitleField("Бок правый"), new TextSelect(ITEMS_SIDE_RIGHT)),
    PERFO(new TitleField("Перфорация"), new TextSelect(ITEMS_PERFO)),
    SIDE_FACE(new TitleField("Перед"), new TextSelect(ITEMS_SIDE_FACE)),
    UGOLOK(new TitleField("Уголок"), new TextSelect(ITEMS_UGOLOK)),
    RADIUS(new TitleField("Радиус"), new TextSelect(ITEMS_RADIUS)),
    VIREZ(new TitleField("Вырезы"), new ValueSelect(ITEMS_VIREZ)),
    HOLE(new TitleField("Отверстия"), new ValueSelect(ITEMS_HOLE)),
    MAGNET(new TitleField("Магниты"), new ValueSelect(ITEMS_MAGNET)),
    HANDLE(new TitleField("Мебельные ручки"), new ValueSelect(ITEMS_HANDLE)),
    LOCK(new TitleField("Замки"), new ValueSelect(ITEMS_LOCK)),
    MINILATCH(new TitleField("Нажимные механизмы"), new ValueSelect(ITEMS_MINILATCH)),
    SHPINGALET(new TitleField("Шпингалеты"), new ValueSelect(ITEMS_SHPINGALET)),
    UPOR(new TitleField("Упоры"), new ValueSelect(ITEMS_UPOR)),
    GRUNT(new TitleField("Грунтовка"), new TextSelect(ITEMS_GRUNT)),
    COLOR(new TitleField("Цвет"), new TextSelect(ITEMS_COLOR)),
    OTHER_WORK(new TitleField("Дополнительные работы"), new ValueInput()),
    PACK(new TitleField("Упаковка"), new TextSelect(ITEMS_PACK)),
    MARGIN(new TitleField("Наценка"), new ValueInput());


    // надпись для лейбла
    private TitleField title;
    private JComponent component;

    FieldsPanelInput(TitleField title, JComponent component) {
        this.title = title;
        this.component = component;
    }

    public TitleField getTitle() {
        return title;
    }

    public JComponent getComponent() {
            return component;
    }

    public static void setVisibleOff() {
        for(FieldsPanelInput fieldsInput : FieldsPanelInput.values()){
            // скрыть поле
            fieldsInput.getTitle().setVisible(false);
            fieldsInput.getComponent().setVisible(false);

        }
    }
}