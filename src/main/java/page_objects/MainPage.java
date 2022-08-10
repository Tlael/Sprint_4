package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MainPage {

    private WebDriver driver;

    // Кнопка «Cookie»
    private By cookieButton = By.id("rcc-confirm-button");

    // Заголовок страницы Яндекс
    private By yandexLogo = By.className("Header_LogoYandex__3TSOI");

    // Заголовок старницы Самокат
    private By scooterLogo = By.className("Header_LogoScooter__3lsAR");

    // Кнопка «Заказать» вверху справа
    private By orderRightButton = By.cssSelector(".Header_Nav__AGCXC button.Button_Button__ra12g");

    // Кнопка «Статус заказа»
    private By statusOrderButton = By.className("Header_Link__1TAG7");

    // Кнопка «Go»
    private By searchOrderButton = By.className("Header_Button__28dPO");

    // Кнопка «Заказать» в середине экрана
    private By orderButton = By.className("Button_Middle__1CSJM");

    // О важном «Стоимось»
    private By listButton0 = By.id("accordion__heading-0");

    // О важном «Стоимось» текст
    private By textList0 = By.id("accordion__panel-0");

    // О важном «Количество»
    private By listButton1 = By.id("accordion__heading-1");

    // О важном «Количество» текст
    private By textList1 = By.id("accordion__panel-1");

    // О важном «Время аренды»
    private By listButton2 = By.id("accordion__heading-2");

    // О важном «Время аренды» текст
    private By textList2 = By.id("accordion__panel-2");

    // О важном «Сегодня»
    private By listButton3 = By.id("accordion__heading-3");

    // О важном «Сегодня» текст
    private By textList3 = By.id("accordion__panel-3");

    // О важном «Продление заказа»
    private By listButton4 = By.id("accordion__heading-4");

    // О важном «Продление заказа» текст
    private By textList4 = By.id("accordion__panel-4");

    // О важном «Зарядка»
    private By listButton5 = By.id("accordion__heading-5");

    // О важном «Зарядка» текст
    private By textList5 = By.id("accordion__panel-5");

    // О важном «Отмена»
    private By listButton6 = By.id("accordion__heading-6");

    // О важном «Отмена» текст
    private By textList6 = By.id("accordion__panel-6");

    // О важном «За МКАДом»
    private By listButton7 = By.id("accordion__heading-7");

    // О важном «За МКАДом» текст
    private By textList7 = By.id("accordion__panel-7");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String clickListButton0() {
        clickElement(listButton0);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-0")));
        return driver.findElement(textList0).getText();
    }

    public String clickListButton1() {
        clickElement(listButton1);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-1")));
        return driver.findElement(textList1).getText();
    }

    public String clickListButton2() {
        clickElement(listButton2);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-2")));
        return driver.findElement(textList2).getText();
    }

    public String clickListButton3() {
        clickElement(listButton3);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-3")));
        return driver.findElement(textList3).getText();
    }

    public String clickListButton4() {
        clickElement(listButton4);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-4")));
        return driver.findElement(textList4).getText();
    }

    public String clickListButton5() {
        clickElement(listButton5);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-5")));
        return driver.findElement(textList5).getText();
    }

    public String clickListButton6() {
        clickElement(listButton6);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-6")));
        return driver.findElement(textList6).getText();
    }

    public String clickListButton7() {
        clickElement(listButton7);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-7")));
        return driver.findElement(textList7).getText();
    }

    public void clickElement(By listButton) {
        WebElement element = driver.findElement(listButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(listButton).click();
    }

    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }

    public void clickOrderRightButton() {
        driver.findElement(orderRightButton).click();
    }

    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }
}