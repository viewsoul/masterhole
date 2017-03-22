package ru.masterhole.ui;

import javax.swing.*;

import static ru.masterhole.ui.Constants.HEIGHT_BUTTON_MENU;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 17.03.2017.
 */
public enum Buttons {
    EKRAN               (new ButtonProduct("Экраны для батарей")),
    RESH_PERFO          (new ButtonProduct("Решётки перфорированные")),
    RESH_PERFO_VSTR     (new ButtonSubProduct("Встраиваемые")),
    RESH_PERFO_NAKL     (new ButtonSubProduct("Накладные")),
    RESH_PERFO_PL       (new ButtonSubProduct("Плоские")),
    RESH_PERFO_PL_SPOD  (new ButtonSubProduct("Плоские с подгибом")),
    RESH_PERFO_VIPKL    (new ButtonSubProduct("Выпуклые")),
    HATCH               (new ButtonProduct("Люки")),
    HATCH_VSTR          (new ButtonSubProduct("Встраиваемые")),
    HATCH_NAKL          (new ButtonSubProduct("Накладные")),
    KOROB               (new ButtonProduct("Короба")),
    KOROB_G             (new ButtonSubProduct("Г-образные")),
    KOROB_P             (new ButtonSubProduct("П-образные")),
    RESH_ZALUZ          (new ButtonProduct("Решётки жалюзийные")),
    RESH_ZALUZ_VSTR     (new ButtonSubProduct("Встраиваемые")),
    RESH_ZALUZ_NAKL     (new ButtonSubProduct("Вакладные")),
    HATCH_PERFO         (new ButtonProduct("Люки перфорированные")),
    HATCH_PERFO_VSTR    (new ButtonSubProduct("Встраиваемые")),
    HATCH_PERFO_NAKL    (new ButtonSubProduct("Накладные"));

    private Button button;

    // конструктор
    Buttons(Button button) {
        this.button = button;
    }

    // получить кнопку
    public Button getButton() {
        return button;
    }

    // получить кнопку по хэшкоду
    public static Button getButton(int hashCode){
        Button button = null;
        for (Buttons buttons : Buttons.values()){
            if (buttons.getButton().hashCode() == hashCode) {
                button = buttons.getButton();
                break;
            }
        }
        return button;
    }

    // инвертировать отображение кнопок для подразделов по индесу кнопки
    public static void setVisibleByIndex(int index){

        // если индекс кнопки соответствует разделу, а не подразделу
        if (Buttons.values()[index].getButton() instanceof ButtonProduct){
            // искать подрезделы для данного раздела
            for(int i = index+1; i < Buttons.values().length; i++){
                // если следующий индекс соотвествует подразделу
                if (Buttons.values()[i].getButton() instanceof ButtonSubProduct) {
                    // инвертировать видимость
                    if (Buttons.values()[i].getButton().isVisible()) {
                        Buttons.values()[i].getButton().setVisible(false);
                    } else {
                        Buttons.values()[i].getButton().setVisible(true);
                    }
                } else {
                    break;
                }
            }
        }
    }

    // инвертировать отображение кнопок для подразделов по хэшкоду
    public static void setVisibleByHashCode(int hashCode){
          setVisibleByIndex(getIndexButton(hashCode));
    }

    // получить индекс кнопки по хэшкоду
    public static int getIndexButton(int hashCode){
        int index = 0;
        for (int i = 0; i < Buttons.values().length; i++){
            if (Buttons.values()[i].getButton().hashCode() == hashCode) {
                index = i;
                break;
            }
        }
        return index;
    }

    // установить кнопку
    public void setButton(Button button) {
        this.button = button;
    }

    // получить сумму высот видимых кнопок
    public static int getHeightVisibleButtons(){
        // количество видимых кнопок
        int count = 0;
        // считаем все видимые
        for (Buttons buttons : Buttons.values()){
            if (buttons.getButton().isVisible()) {
                count++;
            }
        }

        System.out.println("рекомендуемая высота панели меню: "+count*HEIGHT_BUTTON_MENU);

        // возвращаем высоту панели
        return count*HEIGHT_BUTTON_MENU;
    }

    // добавить кнопки на панель
    public static void add(Panel panel){
        for (Buttons buttons : Buttons.values()){
            panel.getPanel().add(buttons.getButton());
        }
    }

}