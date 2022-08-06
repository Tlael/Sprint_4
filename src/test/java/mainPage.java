import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class mainPage {
    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    private By listButton0 = By.id("accordion__heading-0");
    // О важном «Стоимось»
    private By listButton1 = By.id("accordion__heading-1");
    // О важном «Количество»
    private By listButton2 = By.id("accordion__heading-2");
    // О важном «Время аренды»
    private By listButton3 = By.id("accordion__heading-3");
    // О важном «Сегодня»
    private By listButton4 = By.id("accordion__heading-4");
    // О важном «Продление заказа»
    private By listButton5 = By.id("accordion__heading-5");
    // О важном «Зарядка»
    private By listButton6 = By.id("accordion__heading-6");
    // О важном «Отмена»//
    private By listButton7 = By.id("accordion__heading-7");
    // О важном «За МКАДом»

    public mainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickListButton0() {
        clickElement(listButton0);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-0")));
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = driver.findElement(By.id("accordion__panel-0")).getText();
        assertEquals(expected, actual);
    }

    public void clickListButton1() {
        clickElement(listButton1);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-1")));
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = driver.findElement(By.id("accordion__panel-1")).getText();
        assertEquals(expected, actual);
    }

    public void clickListButton2() {
        clickElement(listButton2);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-2")));
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = driver.findElement(By.id("accordion__panel-2")).getText();
        assertEquals(expected, actual);
    }

    public void clickListButton3() {
        clickElement(listButton3);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-3")));
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = driver.findElement(By.id("accordion__panel-3")).getText();
        assertEquals(expected, actual);
    }

    public void clickListButton4() {
        clickElement(listButton4);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-4")));
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = driver.findElement(By.id("accordion__panel-4")).getText();
        assertEquals(expected, actual);
    }

    public void clickListButton5() {
        clickElement(listButton5);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-5")));
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = driver.findElement(By.id("accordion__panel-5")).getText();
        assertEquals(expected, actual);
    }

    public void clickListButton6() {
        clickElement(listButton6);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-6")));
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = driver.findElement(By.id("accordion__panel-6")).getText();
        assertEquals(expected, actual);
    }

    public void clickListButton7() {
        clickElement(listButton7);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-7")));
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = driver.findElement(By.id("accordion__panel-7")).getText();
        assertEquals(expected, actual);
    }

    public void clickElement(By listButton) {
        WebElement element = driver.findElement(listButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(listButton).click();
    }
}