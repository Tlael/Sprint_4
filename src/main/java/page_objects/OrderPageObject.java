package page_objects;

import org.openqa.selenium.By;

public class OrderPageObject {
    // Поле ввода имя
    public By orderName = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");

    // Поле ввода фамилия
    public By orderSurname = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");

    // Поле ввода Адрес
    public By orderAddress = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");

    // Поле ввода метро
    public By orderMetro = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input");

    // Выпадающий список метро
    public By listMetro = By.className("select-search__select");

    // Поле ввода номера телефона
    public By orderPhone = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");

    // Кнопка «Далее»
    public By orderButtonMiddle = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");

    // Поле ввода даты
    public By orderFieldDate = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/input");

    // Поле ввода даты
    public By orderFieldDate2 = By.className("react-datepicker__day--selected");

    // Выбор срока аренды
    public By orderListDate = By.className("Dropdown-control");

    // Выбор срока аренды
    public By orderListDate2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[3]");

    // Выбор черного цвета самоката
    public By orderCheckColourBlack = By.xpath("//*[@id=\"black\"]");

    // Выбор серого цвета самоката
    public By orderCheckColourGray = By.xpath("//*[@id=\"grey\"]");

    // Поле ввода комментария
    public By orderFieldComment = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input");

    // Кнопка «Заказать»
    public By orderButtonOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");

    // Кнопка «Да»
    public By orderButtonYes = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]");

    public By orderMassage = By.className("Order_ModalHeader__3FDaJ");
}