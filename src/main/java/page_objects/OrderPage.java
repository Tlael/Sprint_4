package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;

    // Поле ввода имя
    private By name = By.cssSelector(".Order_Form__17u6u div:nth-child(1) input");

    // Поле ввода фамилия
    private By surname = By.cssSelector(".Order_Form__17u6u div:nth-child(2) input");

    // Поле ввода Адрес
    private By address = By.cssSelector(".Order_Form__17u6u div:nth-child(3) input");
    // Поле ввода метро
    private By metro = By.cssSelector(".Order_Form__17u6u div:nth-child(4) input");

    // Выпадающий список метро
    private By listMetro = By.className("select-search__select");

    // Поле ввода номера телефона
    private By phone = By.cssSelector(".Order_Form__17u6u div:nth-child(5) input");

    // Кнопка «Далее»
    private By buttonMiddle = By.cssSelector(".Order_NextButton__1_rCA button");

    // Поле ввода даты
    private By fieldDate = By.cssSelector(".Order_MixedDatePicker__3qiay input");

    // Поле ввода даты
    private By fieldDate2 = By.className("react-datepicker__day--selected");

    // Выбор срока аренды
    private By listDate = By.className("Dropdown-control");

    // Выбор срока аренды
    private By listDate2 = By.cssSelector(".Dropdown-menu div:nth-child(2)");

    // Выбор черного цвета самоката
    private By checkColourBlack = By.cssSelector("#black");

    // Выбор серого цвета самоката
    private By checkColourGray = By.cssSelector("#grey");

    // Поле ввода комментария
    private By fieldComment = By.cssSelector(".Order_Form__17u6u .Input_InputContainer__3NykH input");

    // Кнопка «Заказать»
    private By buttonOrder = By.cssSelector(".Order_Buttons__1xGrp button:nth-child(2)");

    // Кнопка «Да»
    private By buttonYes = By.cssSelector(".Order_Modal__YZ-d3 .Order_Buttons__1xGrp button:nth-child(2)");

    // Сообщение об оформлении заказа
    private By massage = By.className("Order_ModalHeader__3FDaJ");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String name) {
        driver.findElement(this.name).sendKeys(name);
    }

    public void setSurname(String surname) {
        driver.findElement(this.surname).sendKeys(surname);
    }

    public void setAddress(String address) {
        driver.findElement(this.address).sendKeys(address);
    }

    public void setMetro(String metro) {
        driver.findElement(this.metro).sendKeys(metro);
    }

    public void setPhone(String phone) {
        driver.findElement(this.phone).sendKeys(phone);
    }

    public void setDate(String FieldDate) {
        driver.findElement(fieldDate).sendKeys(FieldDate);
    }

    public void setComment(String FieldComment) {
        driver.findElement(fieldComment).sendKeys(FieldComment);
    }

    public void clickSignInButton() {
        driver.findElement(listMetro).click();
    }

    public void clickButtonMiddle() {
        driver.findElement(buttonMiddle).click();
    }

    public void clickDate() {
        driver.findElement(fieldDate).click();
    }

    public void clickDate2() {
        driver.findElement(fieldDate2).click();
    }

    public void clickListDate() {
        driver.findElement(listDate).click();
    }

    public void clickListDate2() {
        driver.findElement(listDate2).click();
    }

    public void clickCheckColourBlack() {
        driver.findElement(checkColourBlack).click();
    }

    public void clickCheckColourGray() {
        driver.findElement(checkColourGray).click();
    }

    public void clickButtonOrder() {
        driver.findElement(buttonOrder).click();
    }

    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }

    public By getMassage() {
        return massage;
    }

    public String actualMassage() {
        return driver.findElement(getMassage()).getText();
    }

    public void pageOne(String name, String surname, String address, String metro, String phone) {
        setName(name);
        setSurname(surname);
        setAddress(address);
        setMetro(metro);
        clickSignInButton();
        setPhone(phone);
        clickButtonMiddle();
    }

    public void pageTwoField(String fieldDate, String fieldComment) {
        setDate(fieldDate);
        setComment(fieldComment);
    }

    public void pageTwoButton() {
        clickDate();
        clickDate2();
        clickListDate();
        clickListDate2();
        clickCheckColourBlack();
        clickButtonOrder();
        clickButtonYes();
    }

    public void setCheckColourBlack() {
        clickCheckColourBlack();
    }

    public void setCheckColourGray() {
        clickCheckColourGray();
    }
}