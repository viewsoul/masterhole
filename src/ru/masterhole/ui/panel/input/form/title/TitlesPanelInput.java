package ru.masterhole.ui.panel.input.form.title;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public enum TitlesPanelInput {
    TITLE_EKRAN               (new TitleForm("Экраны для батарей")),
    TITLE_RESH_PERFO          (new TitleForm("Решётки перфорированные")),
    TITLE_RESH_PERFO_VSTR     (new TitleForm("Решётки перфорированные встраиваемые")),
    TITLE_RESH_PERFO_NAKL     (new TitleForm("Решётки перфорированные накладные")),
    TITLE_RESH_PERFO_PL       (new TitleForm("Решётки перфорированные плоские")),
    TITLE_RESH_PERFO_PL_SPOD  (new TitleForm("Решётки перфорированные плоские с подгибом")),
    TITLE_RESH_PERFO_VIPKL    (new TitleForm("Решётки перфорированные выпуклые")),
    TITLE_HATCH               (new TitleForm("Люки")),
    TITLE_HATCH_VSTR          (new TitleForm("Люки встраиваемые")),
    TITLE_HATCH_NAKL          (new TitleForm("Люки накладные")),
    TITLE_KOROB               (new TitleForm("Короба")),
    TITLE_KOROB_G             (new TitleForm("Короба Г-образные")),
    TITLE_KOROB_P             (new TitleForm("Короба П-образные")),
    TITLE_RESH_ZALUZ          (new TitleForm("Решётки жалюзийные")),
    TITLE_RESH_ZALUZ_VSTR     (new TitleForm("Решётки жалюзийные встраиваемые")),
    TITLE_RESH_ZALUZ_NAKL     (new TitleForm("Решётки жалюзийные накладные")),
    TITLE_HATCH_PERFO         (new TitleForm("Люки перфорированные")),
    TITLE_HATCH_PERFO_VSTR    (new TitleForm("Люки перфорированные встраиваемые")),
    TITLE_HATCH_PERFO_NAKL    (new TitleForm("Люки перфорированные накладные")),
    TITLE_SHEET               (new TitleForm("Листы металлические"));

    private TitleForm titleForm;

    TitlesPanelInput(TitleForm titleForm) {
        this.titleForm = titleForm;
    }

    public TitleForm getLableTitle() {
        return titleForm;
    }

    public static void setVisibleOff(){
        for (TitlesPanelInput titlesPanelInput : TitlesPanelInput.values()){
            titlesPanelInput.getLableTitle().setVisible(false);
        }
    }


}
