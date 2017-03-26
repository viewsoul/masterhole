package ru.masterhole.ui.panel.input.title;

import ru.masterhole.ui.panel.Panel;
import ru.masterhole.ui.panel.input.title.label.LabelTitle;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public enum TitlesPanelInput {
    TITLE_EKRAN               (new LabelTitle("Экраны для батарей")),
    TITLE_RESH_PERFO          (new LabelTitle("Решётки перфорированные")),
    TITLE_RESH_PERFO_VSTR     (new LabelTitle("Решётки перфорированные встраиваемые")),
    TITLE_RESH_PERFO_NAKL     (new LabelTitle("Решётки перфорированные накладные")),
    TITLE_RESH_PERFO_PL       (new LabelTitle("Решётки перфорированные плоские")),
    TITLE_RESH_PERFO_PL_SPOD  (new LabelTitle("Решётки перфорированные плоские с подгибом")),
    TITLE_RESH_PERFO_VIPKL    (new LabelTitle("Решётки перфорированные выпуклые")),
    TITLE_HATCH               (new LabelTitle("Люки")),
    TITLE_HATCH_VSTR          (new LabelTitle("Люки встраиваемые")),
    TITLE_HATCH_NAKL          (new LabelTitle("Люки накладные")),
    TITLE_KOROB               (new LabelTitle("Короба")),
    TITLE_KOROB_G             (new LabelTitle("Короба Г-образные")),
    TITLE_KOROB_P             (new LabelTitle("Короба П-образные")),
    TITLE_RESH_ZALUZ          (new LabelTitle("Решётки жалюзийные")),
    TITLE_RESH_ZALUZ_VSTR     (new LabelTitle("Решётки жалюзийные встраиваемые")),
    TITLE_RESH_ZALUZ_NAKL     (new LabelTitle("Решётки жалюзийные накладные")),
    TITLE_HATCH_PERFO         (new LabelTitle("Люки перфорированные")),
    TITLE_HATCH_PERFO_VSTR    (new LabelTitle("Люки перфорированные встраиваемые")),
    TITLE_HATCH_PERFO_NAKL    (new LabelTitle("Люки перфорированные накладные"));

    private LabelTitle labelTitle;

    TitlesPanelInput(LabelTitle labelTitle) {
        this.labelTitle = labelTitle;
    }

    public LabelTitle getLableTitle() {
        return labelTitle;
    }

    // добавить заголовок на панель
    public static void addLabelTitle(Panel panel) {
        for (TitlesPanelInput titlesPanelInput : TitlesPanelInput.values()){
            // скрыть заголовок
            titlesPanelInput.getLableTitle().setVisible(false);
            // добавить заголовок на панель
            panel.getPanel().add(titlesPanelInput.getLableTitle());
        }

    }

    public static void setVisibleOff(){
        for (TitlesPanelInput titlesPanelInput : TitlesPanelInput.values()){
            titlesPanelInput.getLableTitle().setVisible(false);
        }
    }


}
