package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderChrome {
    private final WebDriver driver;

    public OrderChrome(WebDriver driver) {
        this.driver = driver;
    }

    public void getChromeOrderBlack() {
        MainPageObject MainPageObject = new MainPageObject();
        OrderPageObject orderPageObject = new OrderPageObject();

        driver.findElement(MainPageObject.orderRightButton).click();
        driver.findElement(orderPageObject.orderName).sendKeys("Иван");
        driver.findElement(orderPageObject.orderSurname).sendKeys("Иванов");
        driver.findElement(orderPageObject.orderAddress).sendKeys("г. Москва, ул. Ленина, д. 1, кв. 1");
        driver.findElement(orderPageObject.orderMetro).sendKeys("ВДНХ");
        driver.findElement(orderPageObject.listMetro).click();
        driver.findElement(orderPageObject.orderPhone).sendKeys("+79001111111");
        driver.findElement(orderPageObject.orderButtonMiddle).click();
        driver.findElement(orderPageObject.orderFieldDate).sendKeys("24.04.2022");
        driver.findElement(orderPageObject.orderFieldDate2).click();
        driver.findElement(orderPageObject.orderListDate).click();
        driver.findElement(orderPageObject.orderListDate2).click();
        driver.findElement(orderPageObject.orderCheckColourBlack).click();
        driver.findElement(orderPageObject.orderFieldComment).click();
        driver.findElement(orderPageObject.orderFieldComment).sendKeys("Хочу красивый самокат для котика");
        driver.findElement(orderPageObject.orderButtonOrder).click();
        driver.findElement(orderPageObject.orderButtonYes).click();
    }

    public void getChromeOrderGray() {
        MainPageObject mainPageObject = new MainPageObject();
        OrderPageObject orderPageObject = new OrderPageObject();

        driver.findElement(mainPageObject.cookieButton).click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button")));
        driver.findElement(mainPageObject.orderButton).click();
        driver.findElement(orderPageObject.orderName).sendKeys("Анна");
        driver.findElement(orderPageObject.orderSurname).sendKeys("Кларк");
        driver.findElement(orderPageObject.orderAddress).sendKeys("г. Москва, ул. Ленина, д. 1, кв. 1");
        driver.findElement(orderPageObject.orderMetro).sendKeys("ВДНХ");
        driver.findElement(orderPageObject.listMetro).click();
        driver.findElement(orderPageObject.orderPhone).sendKeys("+79001111112");
        driver.findElement(orderPageObject.orderButtonMiddle).click();
        driver.findElement(orderPageObject.orderFieldDate).sendKeys("28.04.2022");
        driver.findElement(orderPageObject.orderFieldDate2).click();
        driver.findElement(orderPageObject.orderListDate).click();
        driver.findElement(orderPageObject.orderListDate2).click();
        driver.findElement(orderPageObject.orderCheckColourGray).click();
        driver.findElement(orderPageObject.orderFieldComment).click();
        driver.findElement(orderPageObject.orderFieldComment).sendKeys("I want a beautiful scooter for a cat");
        driver.findElement(orderPageObject.orderButtonOrder).click();
        driver.findElement(orderPageObject.orderButtonYes).click();
    }
}