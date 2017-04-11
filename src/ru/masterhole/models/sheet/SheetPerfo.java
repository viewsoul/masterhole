package ru.masterhole.models.sheet;

import ru.masterhole.models.sheet.steel.SteelAppearance;
import ru.masterhole.models.sheet.steel.SteelComposition;
import ru.masterhole.models.sheet.steel.SteelPerfo;
import ru.masterhole.models.sheet.steel.SteelThickness;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 10.04.2017.
 */
public class SheetPerfo extends Sheet {

    private SteelPerfo steelPerfo;

    public SheetPerfo(int cost, SteelComposition type, SteelThickness steelThickness, SteelAppearance steelAppearance, SteelPerfo steelPerfo) {
        super(cost, type, steelThickness, steelAppearance);
        this.steelPerfo = steelPerfo;
    }

    public SteelPerfo getSteelPerfo() {
        return steelPerfo;
    }

    public void setSteelPerfo(SteelPerfo steelPerfo) {
        this.steelPerfo = steelPerfo;
    }
}
