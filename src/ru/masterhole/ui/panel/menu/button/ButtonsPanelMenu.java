package ru.masterhole.ui.panel.menu.button;

import ru.masterhole.ui.panel.Panel;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 17.03.2017.
 */
public enum ButtonsPanelMenu implements SizePanelMenuButton {
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
    RESH_ZALUZ_NAKL     (new ButtonSubProduct("Накладные")),
    HATCH_PERFO         (new ButtonProduct("Люки перфорированные")),
    HATCH_PERFO_VSTR    (new ButtonSubProduct("Встраиваемые")),
    HATCH_PERFO_NAKL    (new ButtonSubProduct("Накладные")),
    SHEET               (new ButtonProduct("Листы"));

    private Button button;

    // конструктор
    ButtonsPanelMenu(Button button) {
        this.button = button;
    }

    // получить кнопку
    public Button getButton() {
        return button;
    }

    // получить кнопку
    public void setButton(Button button) {
        this.button = button;
    }

    // получить кнопку по хэшкоду
    public static Button getButton(int hashCode){
        Button button = null;
        for (ButtonsPanelMenu buttonsPanelMenu : ButtonsPanelMenu.values()){
            if (buttonsPanelMenu.getButton().hashCode() == hashCode) {
                button = buttonsPanelMenu.getButton();
                break;
            }
        }
        return button;
    }

    // источник
    public static ButtonsPanelMenu getSource(int hashCode){
        ButtonsPanelMenu bpm = null;
        for (ButtonsPanelMenu buttonsPanelMenu : ButtonsPanelMenu.values()){
            if (buttonsPanelMenu.getButton().hashCode() == hashCode) {
                bpm = buttonsPanelMenu;
                break;
            }
        }
        return bpm;
    }

    // инвертировать отображение кнопок для подразделов по индесу кнопки
    public static void reviewSubButtonsByIndex(int index){

        // если индекс кнопки соответствует разделу, а не подразделу
        if (ButtonsPanelMenu.values()[index].getButton() instanceof ButtonProduct){
            // искать подрезделы для данного раздела
            for(int i = index+1; i < ButtonsPanelMenu.values().length; i++){
                // если следующий индекс соотвествует подразделу
                if (ButtonsPanelMenu.values()[i].getButton() instanceof ButtonSubProduct) {
                    // инвертировать видимость
                    if (ButtonsPanelMenu.values()[i].getButton().isVisible()) {
                        ButtonsPanelMenu.values()[i].getButton().setVisible(false);
                    } else {
                        ButtonsPanelMenu.values()[i].getButton().setVisible(true);
                    }
                } else {
                    break;
                }
            }
        }
    }

    // инвертировать отображение кнопок для подразделов по хэшкоду
    public static void reviewSubButtonsByHashCode(int hashCode){
          reviewSubButtonsByIndex(getIndexButton(hashCode));
    }

    // получить индекс кнопки по хэшкоду
    public static int getIndexButton(int hashCode){
        int index = 0;
        for (int i = 0; i < ButtonsPanelMenu.values().length; i++){
            if (ButtonsPanelMenu.values()[i].getButton().hashCode() == hashCode) {
                index = i;
                break;
            }
        }
        return index;
    }


    // получить сумму высот видимых кнопок
    public static int getHeightVisibleButtons(){
        // количество видимых кнопок
        int count = 0;
        // считаем все видимые
        for (ButtonsPanelMenu buttonsPanelMenu : ButtonsPanelMenu.values()){
            if (buttonsPanelMenu.getButton().isVisible()) {
                count++;
            }
        }

        int heightPanel = (HEIGHT_BORDER_BUTTON_MENU+HEIGHT_BUTTON_MENU)*count+HEIGHT_BORDER_BUTTON_MENU;

        // возвращаем высоту панели
        return heightPanel;
    }

    // добавить кнопки на панель
    public static void addButtons(Panel panel){
        for (ButtonsPanelMenu buttonsPanelMenu : ButtonsPanelMenu.values()){
            panel.getPanel().add(buttonsPanelMenu.getButton());
        }
    }

}