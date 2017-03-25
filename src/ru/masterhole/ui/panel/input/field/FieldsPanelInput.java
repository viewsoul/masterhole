package ru.masterhole.ui.panel.input.field;

import ru.masterhole.ui.panel.input.field.label.LabelField;
import ru.masterhole.ui.panel.Panel;
import ru.masterhole.ui.panel.input.field.item.ItemsPanelInputFields;

import javax.swing.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public enum FieldsPanelInput implements ItemsPanelInputFields {
    SIZE(new LabelField("Размеры"), new JComboBox<String>(ITEMS_SIZE)),
    LENGHT(new LabelField("Длина"), new JTextField()),
    HEIGHT(new LabelField("Высота"), new JTextField()),
    DEPTH(new LabelField("Глубина"), new JTextField()),
    HEIGHT_TWO(new LabelField("Высота"), new JTextField()),
    BULGE(new LabelField("Выпуклость"), new JTextField()),
    RAMKA(new LabelField("Рамка"), new JComboBox<Integer>(ITEMS_RAMKA)),
    RAMKA_ZALUZ(new LabelField("Рамка"), new JComboBox<Integer>(ITEMS_RAMKA_ZALUZ)),
    RAMKA_SPOD(new LabelField("Рамка с подгибом"), new JComboBox<String>(ITEMS_RAMKA_SPOD)),
    RAMKA_PLIT(new LabelField("Рамка плиточная"), new JComboBox<String>(ITEMS_RAMKA_PLIT)),
    REBRO(new LabelField("Ребро"), new JComboBox<Integer>(ITEMS_REBRO)),
    DOOR_TWO(new LabelField("Двухдверный"), new JComboBox<String>(ITEMS_DOOR_TWO)),
    USILITEL(new LabelField("Усилитель"), new JComboBox<Integer>(ITEMS_USILITEL)),
    SIDE_LEFT(new LabelField("Бок левый"), new JComboBox<String>(ITEMS_SIDE_LEFT)),
    SIDE_RIGHT(new LabelField("Бок правый"), new JComboBox<String>(ITEMS_SIDE_RIGHT)),
    PERFO(new LabelField("Перфорация"), new JComboBox<String>(ITEMS_PERFO)),
    UGOLOK(new LabelField("Уголок"), new JComboBox<String>(ITEMS_UGOLOK)),
    RADIUS(new LabelField("Радиус"), new JComboBox<String>(ITEMS_RADIUS)),
    VIREZ(new LabelField("Вырезы"), new JComboBox<Integer>(ITEMS_VIREZ)),
    HOLE(new LabelField("Отверстия"), new JComboBox<Integer>(ITEMS_HOLE)),
    MAGNET(new LabelField("Магниты"), new JComboBox<Integer>(ITEMS_MAGNET)),
    HANDLE(new LabelField("Мебельные ручки"), new JComboBox<Integer>(ITEMS_HANDLE)),
    LOCK(new LabelField("Замки"), new JComboBox<Integer>(ITEMS_LOCK)),
    MINILATCH(new LabelField("Нажимные механизмы"), new JComboBox<Integer>(ITEMS_MINILATCH)),
    SHPINGALET(new LabelField("Шпингалеты"), new JComboBox<Integer>(ITEMS_SHPINGALET)),
    UPOR(new LabelField("Упоры"), new JComboBox<Integer>(ITEMS_UPOR)),
    GRUNT(new LabelField("Грунтовка"), new JComboBox<String>(ITEMS_GRUNT)),
    COLOR(new LabelField("Цвет"), new JComboBox<String>(ITEMS_COLOR)),
    OTHER_WORK(new LabelField("Дополнительные работы"), new JTextField()),
    PACK(new LabelField("Упаковка"), new JComboBox<String>(ITEMS_PACK)),
    MARGIN(new LabelField("Наценка"), new JTextField());


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
            panel.getPanel().add(fieldsInput.getText());
            panel.getPanel().add(fieldsInput.getComponent());
        }
    }
}