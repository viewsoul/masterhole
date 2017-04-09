package ru.masterhole.models.sheet;

import ru.masterhole.models.sheet.steel.SteelAppearance;
import ru.masterhole.models.sheet.steel.SteelPerfo;
import ru.masterhole.models.sheet.steel.SteelThickness;
import ru.masterhole.models.sheet.steel.SteelComposition;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 07.04.2017.
 */
public enum Sheets {
    BLACK_GLUH_0_8(new Sheet(340, SteelComposition.BLACK, SteelThickness.THICKNESS_0_8, SteelAppearance.GLUH)),
    BLACK_GLUH_1_0(new Sheet(0, SteelComposition.BLACK, SteelThickness.THICKNESS_1_0, SteelAppearance.GLUH)),
    BLACK_GLUH_1_2(new Sheet(0, SteelComposition.BLACK, SteelThickness.THICKNESS_1_2, SteelAppearance.GLUH)),
    BLACK_GLUH_1_5(new Sheet(0, SteelComposition.BLACK, SteelThickness.THICKNESS_1_5, SteelAppearance.GLUH)),
    BLACK_GLUH_2_0(new Sheet(0, SteelComposition.BLACK, SteelThickness.THICKNESS_2_0, SteelAppearance.GLUH)),

    BLACK_PERFO_1_0_RV_3_5(new SheetPerfo(0, SteelComposition.BLACK, SteelThickness.THICKNESS_1_0,
            SteelAppearance.PERFO, SteelPerfo.RV_3_5)),
    BLACK_PERFO_1_0_QG_5_8(new SheetPerfo(0, SteelComposition.BLACK, SteelThickness.THICKNESS_1_0,
            SteelAppearance.PERFO, SteelPerfo.QG_5_8)),
    BLACK_PERFO_1_0_QG_10_14(new SheetPerfo(0, SteelComposition.BLACK, SteelThickness.THICKNESS_1_0,
            SteelAppearance.PERFO, SteelPerfo.QG_10_14)),
    BLACK_PERFO_1_0_QG_3_5(new SheetPerfo(0, SteelComposition.BLACK, SteelThickness.THICKNESS_1_0,
            SteelAppearance.PERFO, SteelPerfo.QG_3_5)),
    BLACK_PERFO_1_0_NR_152(new SheetPerfo(0, SteelComposition.BLACK, SteelThickness.THICKNESS_1_0,
            SteelAppearance.PERFO, SteelPerfo.NR_152)),

    ZINK_PERFO_1_0_NR_152(new SheetPerfo(0, SteelComposition.ZINC, SteelThickness.THICKNESS_1_0,
            SteelAppearance.PERFO, SteelPerfo.NR_152)),

    STAINLESS_PERFO_1_0_NR_152(new SheetPerfo(0, SteelComposition.STAINLESS, SteelThickness.THICKNESS_1_0,
            SteelAppearance.PERFO, SteelPerfo.NR_152));

    private Sheet sheet;

    Sheets(Sheet sheet) {
        this.sheet = sheet;
    }

    public Sheet getSheet() {
        return sheet;
    }

    public void setSheet(Sheet sheet) {
        this.sheet = sheet;
    }
}
