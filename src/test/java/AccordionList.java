import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.MainPage;


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
        MainPage accordion = new MainPage(driver);
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        Assert.assertEquals(expected, accordion.clickListButton0());
    }

    @Test
    public void clickListButton1() {
        MainPage accordion = new MainPage(driver);
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        Assert.assertEquals(expected, accordion.clickListButton1());
    }

    @Test
    public void clickListButton2() {
        MainPage accordion = new MainPage(driver);
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        Assert.assertEquals(expected, accordion.clickListButton2());
    }

    @Test
    public void clickListButton3() {
        MainPage accordion = new MainPage(driver);
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        Assert.assertEquals(expected, accordion.clickListButton3());
    }

    @Test
    public void clickListButton4() {
        MainPage accordion = new MainPage(driver);
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        Assert.assertEquals(expected, accordion.clickListButton4());
    }

    @Test
    public void clickListButton5() {
        MainPage accordion = new MainPage(driver);
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        Assert.assertEquals(expected, accordion.clickListButton5());
    }

    @Test
    public void clickListButton6() {
        MainPage accordion = new MainPage(driver);
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        Assert.assertEquals(expected, accordion.clickListButton6());
    }

    @Test
    public void clickListButton7() {
        MainPage accordion = new MainPage(driver);
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        Assert.assertEquals(expected, accordion.clickListButton7());
    }

    @After
    public void teardown() {
        driver.quit(); // Закрыть браузер
    }
}