import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orders {
    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    @Test
    public void OrderChromeBlack() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderChrome Order = new OrderChrome(driver);
        Order.getChromeOrderRus();
    }

    @Test
    public void OrderChromeGray() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderChrome Order = new OrderChrome(driver);
        Order.getChromeOrderEn();
    }


    @Test
    public void OrderFirefox() {
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderFirefox Order = new OrderFirefox(driver);
        Order.getFirefoxOrder();
    }

    @After
    public void teardown() {
        driver.quit(); // Закрыть браузер
    }
}