import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.OrderChrome;
import page_objects.OrderPageObject;

public class Orders {
    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void OrderChromeBlack() {
        OrderPageObject orderPageObject = new OrderPageObject();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderChrome Order = new OrderChrome(driver);
        Order.getChromeOrderBlack();
        String expected = "Посмотреть статус";
        String actual = driver.findElement(orderPageObject.orderMassage).getText();
        Assert.assertEquals("Заказ не оформлен", expected, actual);
    }

    @Test
    public void OrderChromeGray() {
        OrderPageObject orderPageObject = new OrderPageObject();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderChrome Order = new OrderChrome(driver);
        Order.getChromeOrderGray();
        String expected = "Посмотреть статус";
        String actual = driver.findElement(orderPageObject.orderMassage).getText();
        Assert.assertEquals("Заказ не оформлен", expected, actual);
    }

    @After
    public void teardown() {
        driver.quit(); // Закрыть браузер
    }
}