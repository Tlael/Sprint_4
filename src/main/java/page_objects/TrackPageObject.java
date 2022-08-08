package page_objects;

import org.openqa.selenium.By;

public class TrackPageObject {
    // Поле ввода номера заказа
    public By orderField = By.className("Input_Input__1iN_Z Header_Input__xIoUq");

    // Кнопка «Посмотреть»
    public By orderButtonSee = By.className("Button_Middle__1CSJM['Посмотреть']");

    // Кнопка «Отменить»
    public By orderButtonCancel = By.className("Button_Middle__1CSJM['Отменить заказ']");
}