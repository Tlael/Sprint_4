package Page_Objects;

import org.openqa.selenium.By;

public class orderPageObject {
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

    private By orderName = By.className("Input_Input__1iN_Z.Input_Error__1Tx5d");
    // Поле ввода имя

    private By orderSurname = By.className("Input_Responsible__1jDKN[placeholder='* Фамилия']");
    // Поле ввода фамилия

    private By orderAdress = By.className("Input_Responsible__1jDKN[placeholder='* Адрес: куда привезти заказ']");
    // Поле ввода Адрес

    private By orderMetro = By.className("select-search__value");
    // Поле ввода и выпадающего списка метро

    private By orderPhone = By.className("Input_Responsible__1jDKN[placeholder='* Телефон: на него позвонит курьер']");
    // Поле ввода номера телефона

    private By orderButtonMiddle = By.className("Button_Middle__1CSJM");
    // Кнопка «Далее»

    private By orderFieldDate = By.className("react-datepicker__input-container");
    // Поле ввода даты

    private By orderListDate = By.className("Dropdown-root");
    // Выбор срока аренды

    private By orderCheckColour = By.className("Order_Checkboxes__3lWSI");
    // Выбор цвета самоката

    private By orderFieldComment = By.className("Input_Responsible__1jDKN[placeholder='Комментарий для курьера']");
    // Поле ввода комментария

    private By orderButtonBack = By.linkText("Заказать");
    // Кнопка «Назад»

    private By orderButtonOrder = By.className("Button_Inverted__3IF-i[placeholder='Заказать']");
    // Кнопка «Заказать»

    private By orderButtonYes = By.linkText("Да");
    // Кнопка «Да»

    private By orderButtonNo = By.linkText("Нет");
    // Кнопка «Нет»
}