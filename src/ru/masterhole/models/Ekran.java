package ru.masterhole.models;

import ru.masterhole.models.color.Colors;
import ru.masterhole.models.sheet.Sheet;
import ru.masterhole.models.sheet.Sheets;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 06.04.2017.
 */
public class Ekran {

    // размер в миллиметрах
    int length;
    int height;
    int depth;

    // размеры рамки: L,  L,  H,  H, мм
    private int sizeBorderFront[];
    private int sizeBorderBack[];
    private int sizeBorderUp[];
    private int sizeBorderDown[];
    private int sizeBorderLeft[];
    private int sizeBorderRight[];

    // лист металла
    private Sheet sheetBorder;
    private Sheet sheetUp;
    private Sheet sheetDown;
    private Sheet sheetFront;
    private Sheet sheetBack;
    private Sheet sheetLeft;
    private Sheet sheetRight;

    private Colors color;

    public Ekran(int length, int height, int depth) {
        this.length = length;
        this.height = height;
        this.depth = depth;
        this.setSheetBorder(Sheets.BLACK_GLUH_0_8.getSheet());
        this.setSheetUp(Sheets.BLACK_PERFO_1_0_RV_3_5.getSheet());
        this.setSheetFront(Sheets.BLACK_PERFO_1_0_RV_3_5.getSheet());
        this.setColors(Colors.WHITE);
        this.setSizeBorderForPerfoOpen();
    }

    public void setSizeBorderForPerfoOpen() {
        this.setSizeBorderFront(new int[]{0, 15, 15, 15});
        this.setSizeBorderBack(new int[]{15, 0, 0, 0});
        this.setSizeBorderUp(new int[]{15, 0, 15, 15});
        this.setSizeBorderDown(new int[]{15, 0, 0, 0});
        this.setSizeBorderLeft(new int[]{15, 0, 15, 0});
        this.setSizeBorderRight(new int[]{15, 0, 15, 0});
    }

    public void setLenght(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }


    public void setSizeBorderFront(int[] sizeBorderFront) {
        this.sizeBorderFront = sizeBorderFront;
    }

    public void setSizeBorderBack(int[] sizeBorderBack) {
        this.sizeBorderBack = sizeBorderBack;
    }

    public void setSizeBorderUp(int[] sizeBorderUp) {
        this.sizeBorderUp = sizeBorderUp;
    }

    public void setSizeBorderDown(int[] sizeBorderDown) {
        this.sizeBorderDown = sizeBorderDown;
    }

    public void setSizeBorderLeft(int[] sizeBorderLeft) {
        this.sizeBorderLeft = sizeBorderLeft;
    }

    public void setSizeBorderRight(int[] sizeBorderRight) {
        this.sizeBorderRight = sizeBorderRight;
    }


    public void setSheetBorder(Sheet sheetBorder) {
        this.sheetBorder = sheetBorder;
    }

    public void setSheetUp(Sheet sheetUp) {
        this.sheetUp = sheetUp;
    }

    public void setSheetDown(Sheet sheetDown) {
        this.sheetDown = sheetDown;
    }

    public void setSheetFront(Sheet sheetFront) {
        this.sheetFront = sheetFront;
    }

    public void setSheetBack(Sheet sheetBack) {
        this.sheetBack = sheetBack;
    }

    public void setSheetLeft(Sheet sheetLeft) {
        this.sheetLeft = sheetLeft;
    }

    public void setSheetRight(Sheet sheetRight) {
        this.sheetRight = sheetRight;
    }

    public void setColors(Colors color) {
        this.color = color;
    }

}
