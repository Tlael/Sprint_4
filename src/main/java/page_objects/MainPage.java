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
    MainPageObject mainPageObject = new MainPageObject();

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickListButton0() {
        clickElement(mainPageObject.listButton0);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-0")));
    }

    public void clickListButton1() {
        clickElement(mainPageObject.listButton1);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-1")));
    }

    public void clickListButton2() {
        clickElement(mainPageObject.listButton2);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-2")));
    }

    public void clickListButton3() {
        clickElement(mainPageObject.listButton3);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-3")));
    }

    public void clickListButton4() {
        clickElement(mainPageObject.listButton4);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-4")));
    }

    public void clickListButton5() {
        clickElement(mainPageObject.listButton5);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-5")));
    }

    public void clickListButton6() {
        clickElement(mainPageObject.listButton6);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-6")));
    }

    public void clickListButton7() {
        clickElement(mainPageObject.listButton7);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accordion__panel-7")));
    }

    public void clickElement(By listButton) {
        WebElement element = driver.findElement(listButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(listButton).click();
    }
}