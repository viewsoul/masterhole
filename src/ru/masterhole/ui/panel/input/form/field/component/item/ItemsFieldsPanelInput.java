package ru.masterhole.ui.panel.input.form.field.component.item;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 25.03.2017.
 */
public interface ItemsFieldsPanelInput {

    // поля комбобоксов на панели ввода
    String TEXT_SIZE_POSADKA = "Посадочный";
    String TEXT_SIZE_GABARIT = "Габаритный";
    String[] ITEMS_SIZE = {TEXT_SIZE_POSADKA, TEXT_SIZE_GABARIT};

    Integer[] ITEMS_RAMKA = {10,15,20,25,30,35,40,45,50,55,60};
    Integer[] ITEMS_RAMKA_ZALUZ = {30,35,40,45,50,55,60,65,70};
    Integer[] ITEMS_REBRO = {10,15,20,25,30,35,40,45,50,55,60};
    Integer[] ITEMS_USILITEL = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    Integer[] ITEMS_VIREZ = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    Integer[] ITEMS_HOLE = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    Integer[] ITEMS_MAGNET = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    Integer[] ITEMS_HANDLE = {0,1,2,3,4,5,6};
    Integer[] ITEMS_LOCK = {0,1,2,3,4,5,6};
    Integer[] ITEMS_MINILATCH = {0,1,2,3,4,5,6,7,8};
    Integer[] ITEMS_SHPINGALET = {0,1,2,3,4,5,6};
    Integer[] ITEMS_UPOR = {0,1,2,3,4,5,6};

    String TEXT_RAMKA_SPOD_NONE = "Нет";
    String TEXT_RAMKA_SPOD = "Рамка с подгибом";
    String[] ITEMS_RAMKA_SPOD = {TEXT_RAMKA_SPOD_NONE, TEXT_RAMKA_SPOD};

    String TEXT_RAMKA_PLIT_NONE = "Нет";
    String TEXT_RAMKA_PLIT = "Рамка П-образная";
    String[] ITEMS_RAMKA_PLIT = {TEXT_RAMKA_PLIT_NONE, TEXT_RAMKA_PLIT};

    String TEXT_DOOR_ONE = "Одна дверь";
    String TEXT_DOOR_TWO = "2-х дверный";
    String[] ITEMS_DOOR_TWO = {TEXT_DOOR_ONE, TEXT_DOOR_TWO};

    String TEXT_SIDE_NONE = "Нет";
    String TEXT_SIDE_PERFO = "Перфорированный";
    String TEXT_SIDE_GLUH = "Глухой";
    String[] ITEMS_SIDE_LEFT = {TEXT_SIDE_NONE, TEXT_SIDE_PERFO, TEXT_SIDE_GLUH};
    String[] ITEMS_SIDE_RIGHT = {TEXT_SIDE_NONE, TEXT_SIDE_PERFO, TEXT_SIDE_GLUH};
    String[] ITEMS_SIDE_FACE = {TEXT_SIDE_PERFO, TEXT_SIDE_GLUH};

    String TEXT_PERFO_RV = "Круг";
    String TEXT_PERFO_QG5 = "Квадрат 5-8";
    String TEXT_PERFO_QG3 = "Квадрат 3-5";
    String TEXT_PERFO_NR = "Цветок";
    String[] ITEMS_PERFO = {TEXT_PERFO_RV, TEXT_PERFO_QG5, TEXT_PERFO_QG3, TEXT_PERFO_NR};

    String TEXT_UGOLOK_15X15 = "15х15";
    String TEXT_UGOLOK_20X15 = "20х15";
    String TEXT_UGOLOK_25X15 = "25x15";
    String TEXT_UGOLOK_PERFO15 = "Подгиб перфорации до 15 мм";
    String[] ITEMS_UGOLOK = {TEXT_UGOLOK_15X15, TEXT_UGOLOK_20X15, TEXT_UGOLOK_25X15, TEXT_UGOLOK_PERFO15};

    String TEXT_RADIUS_NONE = "Нет";
    String TEXT_RADIUS = "По радиусу";
    String[] ITEMS_RADIUS = {TEXT_RADIUS_NONE, TEXT_RADIUS};

    String TEXT_GRUNT_NONE = "Нет";
    String TEXT_GRUNT = "Грунтовка";
    String[] ITEMS_GRUNT = {TEXT_GRUNT_NONE, TEXT_GRUNT};

    String TEXT_COLOR_WHITE = "Белый";
    String TEXT_COLOR_WHITE_MATE = "Белый матовый";
    String TEXT_COLOR_COLOR = "Цветной";
    String TEXT_COLOR_ANTIK = "Антик";
    String TEXT_COLOR_RAL9006 = "RAL 9006 Металлик";
    String TEXT_COLOR_CHROM = "Хром";
    String TEXT_COLOR_RAL1036 = "RAL 1036 Золото";
    String[] ITEMS_COLOR = {TEXT_COLOR_WHITE, TEXT_COLOR_WHITE_MATE, TEXT_COLOR_COLOR, TEXT_COLOR_ANTIK,
            TEXT_COLOR_RAL9006, TEXT_COLOR_CHROM, TEXT_COLOR_RAL1036};

    String TEXT_PACK_STRETCH = "Стрейч-плёнка";
    String TEXT_PACK_KARTON = "Гофро-картон";
    String[] ITEMS_PACK = {TEXT_PACK_STRETCH, TEXT_PACK_KARTON};
}
