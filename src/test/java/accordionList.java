import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class accordionList {
    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void clickListButton0() {
        //Блок accordion
        mainPage accordion = new mainPage(driver);
        accordion.clickListButton0();
    }

    @Test
    public void clickListButton1() {
        //Блок Accordion
        mainPage Accordion = new mainPage(driver);
        Accordion.clickListButton1();
    }

    @Test
    public void clickListButton2() {
        //Блок accordion
        mainPage accordion = new mainPage(driver);
        accordion.clickListButton2();
    }

    @Test
    public void clickListButton3() {
        //Блок accordion
        mainPage accordion = new mainPage(driver);
        accordion.clickListButton3();
    }

    @Test
    public void clickListButton4() {
        //Блок accordion
        mainPage accordion = new mainPage(driver);
        accordion.clickListButton4();
    }

    @Test
    public void clickListButton5() {
        //Блок accordion
        mainPage accordion = new mainPage(driver);
        accordion.clickListButton5();
    }

    @Test
    public void clickListButton6() {
        //Блок accordion
        mainPage accordion = new mainPage(driver);
        accordion.clickListButton6();
    }

    @Test
    public void clickListButton7() {
        //Блок accordion
        mainPage accordion = new mainPage(driver);
        accordion.clickListButton7();
    }

    @After
    public void teardown() {
        driver.quit(); // Закрыть браузер
    }
}