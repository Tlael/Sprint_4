package Page_Objects;

import org.openqa.selenium.By;

public class trackPageObject {
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

    private By orderButtonSee = By.className("Button_Middle__1CSJM['Посмотреть']");
    // Кнопка «Посмотреть»

    private By orderButtonCancel = By.className("Button_Middle__1CSJM['Отменить заказ']");
    // Кнопка «Отменить»
}