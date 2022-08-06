package Page_Objects;

import org.openqa.selenium.By;

public class mainPageObject {
    private By yandexLogo = By.className("Header_LogoYandex__3TSOI");
    // Заголовок страницы Яндекс

    private By scooterLogo = By.className("Header_LogoScooter__3lsAR");
    // Заголовок старницы Самокат

    private By orderRightButton = By.className(".Button_Button__ra12g[alt='Заказать']");
    // Кнопка «Заказать» вверху справа

    private By statusOrderButton = By.className("Header_Link__1TAG7");
    // Кнопка «Статус заказа»

    private By searchOrderButton = By.className("Header_Button__28dPO");
    // Кнопка «Go»

    private By orderField = By.className("Input_Input__1iN_Z Header_Input__xIoUq");
    // Поле ввода номера заказа

    private By cookieButton = By.id("rcc-confirm-button");
    // Кнопка «Cookie»

    private By orderButton = By.className("Button_UltraBig__UU3Lp");
    // Кнопка «Заказать» в середине экрана

    private By listButton0 = By.id("accordion__heading-0");
    // О важном «Стоимось»

    private By listButton1 = By.id("accordion__heading-1");
    // О важном «Количество»

    private By listButton2 = By.id("accordion__heading-2");
    // О важном «Время аренды»

    private By listButton3 = By.id("accordion__heading-3");
    // О важном «Сегодня»

    private By listButton4 = By.id("accordion__heading-4");
    // О важном «Продление заказа»

    private By listButton5 = By.id("accordion__heading-5");
    // О важном «Зарядка»

    private By listButton6 = By.id("accordion__heading-6");
    // О важном «Отмена»

    private By listButton7 = By.id("accordion__heading-7");
    // О важном «За МКАДом»
}