package ru.masterhole.models.sheet;

import ru.masterhole.models.sheet.steel.SteelAppearance;
import ru.masterhole.models.sheet.steel.SteelComposition;
import ru.masterhole.models.sheet.steel.SteelThickness;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 06.04.2017.
 */
public class Sheet {
    private SteelComposition steelComposition;
    private SteelAppearance steelAppearance;
    private SteelThickness steelThickness;
    private int cost;

    public Sheet(int cost, SteelComposition type, SteelThickness steelThickness, SteelAppearance steelAppearance) {
        this.cost = cost;
        this.steelComposition = type;
        this.steelThickness = steelThickness;
        this.steelAppearance = steelAppearance;
    }

    public SteelComposition getSteelComposition() {
        return steelComposition;
    }

    public void setSteelComposition(SteelComposition steelComposition) {
        this.steelComposition = steelComposition;
    }

    public SteelAppearance getSteelAppearance() {
        return steelAppearance;
    }

    public void setSteelAppearance(SteelAppearance steelAppearance) {
        this.steelAppearance = steelAppearance;
    }

    public SteelThickness getSteelThickness() {
        return steelThickness;
    }

    public void setSteelThickness(SteelThickness steelThickness) {
        this.steelThickness = steelThickness;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
