package page_objects;

import org.openqa.selenium.By;

public class MainPageObject {
    // Заголовок страницы Яндекс
    public By yandexLogo = By.className("Header_LogoYandex__3TSOI");

    // Заголовок старницы Самокат
    public By scooterLogo = By.className("Header_LogoScooter__3lsAR");

    // Кнопка «Заказать» вверху справа
    public By orderRightButton = By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/button[1]");

    // Кнопка «Статус заказа»
    public By statusOrderButton = By.className("Header_Link__1TAG7");

    // Кнопка «Go»
    public By searchOrderButton = By.className("Header_Button__28dPO");

    // Кнопка «Cookie»
    public By cookieButton = By.id("rcc-confirm-button");

    // Кнопка «Заказать» в середине экрана
    public By orderButton = By.className("Button_Middle__1CSJM");

    // О важном «Стоимось»
    public By listButton0 = By.id("accordion__heading-0");

    // О важном «Стоимось» текст
    public By textList0 = By.id("accordion__panel-0");

    // О важном «Количество»
    public By listButton1 = By.id("accordion__heading-1");

    // О важном «Количество» текст
    public By textList1 = By.id("accordion__panel-1");

    // О важном «Время аренды»
    public By listButton2 = By.id("accordion__heading-2");

    // О важном «Время аренды» текст
    public By textList2 = By.id("accordion__panel-2");

    // О важном «Сегодня»
    public By listButton3 = By.id("accordion__heading-3");

    // О важном «Сегодня» текст
    public By textList3 = By.id("accordion__panel-3");

    // О важном «Продление заказа»
    public By listButton4 = By.id("accordion__heading-4");
    // О важном «Продление заказа» текст
    public By textList4 = By.id("accordion__panel-4");
    // О важном «Зарядка»
    public By listButton5 = By.id("accordion__heading-5");
    // О важном «Зарядка» текст
    public By textList5 = By.id("accordion__panel-5");

    // О важном «Отмена»
    public By listButton6 = By.id("accordion__heading-6");
    // О важном «Отмена» текст
    public By textList6 = By.id("accordion__panel-6");

    // О важном «За МКАДом»
    public By listButton7 = By.id("accordion__heading-7");
    // О важном «За МКАДом» текст
    public By textList7 = By.id("accordion__panel-7");
}