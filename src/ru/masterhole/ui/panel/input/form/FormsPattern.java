package ru.masterhole.ui.panel.input.form;

import ru.masterhole.ui.panel.input.form.field.FieldsPanelInput;
import ru.masterhole.ui.panel.input.form.title.TitlesPanelInput;
import ru.masterhole.ui.panel.menu.button.ButtonsPanelMenu;

import static ru.masterhole.ui.panel.input.form.field.FieldsPanelInput.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public interface FormsPattern {

    // экран для батареи отопления
    FormPattern FORM_EKRAN = new FormPattern(TitlesPanelInput.TITLE_EKRAN,
            new FieldsPanelInput[]{LENGHT,HEIGHT,DEPTH,SIDE_LEFT,SIDE_RIGHT,PERFO,
                    RADIUS,VIREZ,UPOR,GRUNT,COLOR,OTHER_WORK,PACK,MARGIN});

    // решётки перфорированные
    FormPattern FORM_RESH_PERFO = new FormPattern(TitlesPanelInput.TITLE_RESH_PERFO,
            new FieldsPanelInput[]{});

    // решётки перфорированные встраиваемые
    FormPattern FORM_RESH_PERFO_VSTR = new FormPattern(TitlesPanelInput.TITLE_RESH_PERFO_VSTR,
            new FieldsPanelInput[]{SIZE,LENGHT,HEIGHT,RAMKA,REBRO,PERFO,VIREZ,HOLE,
                    GRUNT,COLOR,OTHER_WORK,PACK,MARGIN});


    FormPattern FORM_RESH_PERFO_NAKL = new FormPattern(TitlesPanelInput.TITLE_RESH_PERFO_NAKL,
            new FieldsPanelInput[]{LENGHT,HEIGHT,PERFO,RAMKA,RAMKA_PLIT,REBRO,VIREZ,HOLE,GRUNT,
                    COLOR,OTHER_WORK,PACK,MARGIN});


    FormPattern FORM_RESH_PERFO_PL = new FormPattern(TitlesPanelInput.TITLE_RESH_PERFO_PL,
            new FieldsPanelInput[]{LENGHT,HEIGHT,RAMKA,PERFO,VIREZ,HOLE,GRUNT,COLOR,OTHER_WORK,
                    PACK,MARGIN});


    FormPattern FORM_RESH_PERFO_PL_SPOD = new FormPattern(TitlesPanelInput.TITLE_RESH_PERFO_PL_SPOD,
            new FieldsPanelInput[]{LENGHT,HEIGHT,RAMKA,PERFO,VIREZ,HOLE,GRUNT,COLOR,OTHER_WORK,
                    PACK,MARGIN});


    FormPattern FORM_RESH_PERFO_VIPKL = new FormPattern(TitlesPanelInput.TITLE_RESH_PERFO_VIPKL,
            new FieldsPanelInput[]{SIZE,LENGHT,HEIGHT,BULGE,RAMKA,REBRO,PERFO,VIREZ,HOLE,GRUNT,
                    COLOR,OTHER_WORK,PACK,MARGIN});


    FormPattern FORM_HATCH = new FormPattern(TitlesPanelInput.TITLE_HATCH,
            new FieldsPanelInput[]{});


    FormPattern FORM_HATCH_VSTR = new FormPattern(TitlesPanelInput.TITLE_HATCH_VSTR,
            new FieldsPanelInput[]{SIZE,LENGHT,HEIGHT,RAMKA,RAMKA_SPOD,REBRO,DOOR_TWO,USILITEL,
                    HOLE,HANDLE,MAGNET,LOCK,MINILATCH,SHPINGALET,GRUNT,COLOR,OTHER_WORK,PACK,MARGIN});


    FormPattern FORM_HATCH_NAKL = new FormPattern(TitlesPanelInput.TITLE_HATCH_NAKL,
            new FieldsPanelInput[]{LENGHT,HEIGHT});


    FormPattern FORM_KOROB = new FormPattern(TitlesPanelInput.TITLE_KOROB,
            new FieldsPanelInput[]{});
    FormPattern FORM_KOROB_G = new FormPattern(TitlesPanelInput.TITLE_KOROB_G,
            new FieldsPanelInput[]{});


    FormPattern FORM_KOROB_P = new FormPattern(TitlesPanelInput.TITLE_KOROB_P,
            new FieldsPanelInput[]{});


    FormPattern FORM_RESH_ZALUZ = new FormPattern(TitlesPanelInput.TITLE_RESH_ZALUZ,
            new FieldsPanelInput[]{});


    FormPattern FORM_RESH_ZALUZ_VSTR = new FormPattern(TitlesPanelInput.TITLE_RESH_ZALUZ_VSTR,
            new FieldsPanelInput[]{});


    FormPattern FORM_RESH_ZALUZ_NAKL = new FormPattern(TitlesPanelInput.TITLE_RESH_ZALUZ_NAKL,
            new FieldsPanelInput[]{});


    FormPattern FORM_HATCH_PERFO = new FormPattern(TitlesPanelInput.TITLE_HATCH_PERFO,
            new FieldsPanelInput[]{});


    FormPattern FORM_HATCH_PERFO_VSTR = new FormPattern(TitlesPanelInput.TITLE_HATCH_PERFO_VSTR,
            new FieldsPanelInput[]{});


    FormPattern FORM_HATCH_PERFO_NAKL = new FormPattern(TitlesPanelInput.TITLE_HATCH_PERFO_NAKL,
            new FieldsPanelInput[]{LENGHT,HEIGHT});
}
