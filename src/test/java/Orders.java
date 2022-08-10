import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.MainPage;
import page_objects.OrderPage;

public class Orders {
    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void orderChromeBlack() {
        OrderPage orderPage = new OrderPage(driver);
        MainPage mainPage = new MainPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.clickOrderRightButton();
        orderPage.pageOne("Иван", "Иванов", "г. Москва, ул. Ленина, д. 1, кв. 1", "ВДНХ", "+79001111111");
        orderPage.pageTwoField("24.04.2022", "Хочу красивый самокат для котика");
        orderPage.setCheckColourBlack();
        orderPage.pageTwoButton();
        String expected = "Посмотреть статус";
        Assert.assertEquals("Заказ не оформлен", expected, orderPage.actualMassage());
    }

    @Test
    public void orderChromeGray() {
        OrderPage orderPage = new OrderPage(driver);
        MainPage mainPage = new MainPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.clickCookieButton();
        mainPage.clickOrderButton();
        orderPage.pageOne("Анна", "Кларк", "г. Москва, ул. Ленина, д. 10, кв. 11", "ВДНХ", "+79001111112");
        orderPage.pageTwoField("29.04.2022", "I want a beautiful scooter for a cat");
        orderPage.setCheckColourGray();
        orderPage.pageTwoButton();
        String expected = "Посмотреть статус";
        Assert.assertEquals("Заказ не оформлен", expected, orderPage.actualMassage());
    }

    @After
    public void teardown() {
        driver.quit(); // Закрыть браузер
    }
}