import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.MainPage;
import page_objects.MainPageObject;


public class AccordionList {
    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void clickListButton0() {
        MainPageObject mainPageObject = new MainPageObject();
        MainPage accordion = new MainPage(driver);
        accordion.clickListButton0();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = driver.findElement(mainPageObject.textList0).getText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clickListButton1() {
        MainPageObject mainPageObject = new MainPageObject();
        MainPage accordion = new MainPage(driver);
        accordion.clickListButton1();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = driver.findElement(mainPageObject.textList1).getText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clickListButton2() {
        MainPageObject mainPageObject = new MainPageObject();
        MainPage accordion = new MainPage(driver);
        accordion.clickListButton2();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = driver.findElement(mainPageObject.textList2).getText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clickListButton3() {
        MainPageObject mainPageObject = new MainPageObject();
        MainPage accordion = new MainPage(driver);
        accordion.clickListButton3();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = driver.findElement(mainPageObject.textList3).getText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clickListButton4() {
        MainPageObject mainPageObject = new MainPageObject();
        MainPage accordion = new MainPage(driver);
        accordion.clickListButton4();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = driver.findElement(mainPageObject.textList4).getText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clickListButton5() {
        MainPageObject mainPageObject = new MainPageObject();
        MainPage accordion = new MainPage(driver);
        accordion.clickListButton5();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = driver.findElement(mainPageObject.textList5).getText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clickListButton6() {
        MainPageObject mainPageObject = new MainPageObject();
        MainPage accordion = new MainPage(driver);
        accordion.clickListButton6();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = driver.findElement(mainPageObject.textList6).getText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clickListButton7() {
        MainPageObject mainPageObject = new MainPageObject();
        MainPage accordion = new MainPage(driver);
        accordion.clickListButton7();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = driver.findElement(mainPageObject.textList7).getText();
        Assert.assertEquals(expected, actual);
    }

    @After
    public void teardown() {
        driver.quit(); // Закрыть браузер
    }
}