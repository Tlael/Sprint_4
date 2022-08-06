import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class OrderFirefox {
    private final WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.firefoxdriver().setup();
    }

    private By orderRightButton = By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/button[1]");
    // Кнопка «Заказать» вверху справа

    private By orderName = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    // Поле ввода имя

    private By orderSurname = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    // Поле ввода фамилия

    private By orderAddress = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    // Поле ввода Адрес

    private By orderMetro = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input");
    // Поле ввода метро

    private By listMetro = By.className("select-search__select");
    // Выпадающий список метро

    private By orderPhone = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");
    // Поле ввода номера телефона

    private By orderButtonMiddle = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");
    // Кнопка «Далее»

    private By orderFieldDate = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/input");
    // Поле ввода даты
    private By orderFieldDate2 = By.className("react-datepicker__day--selected");
    // Поле ввода даты

    private By orderListDate = By.className("Dropdown-control");
    // Выбор срока аренды

    private By orderListDate2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[3]");
    // Выбор срока аренды

    private By orderCheckColour = By.xpath("//*[@id=\"black\"]");
    // Выбор цвета самоката

    private By orderFieldComment = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input");
    // Поле ввода комментария

    private By orderButtonOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");
    // Кнопка «Заказать»

    private By orderButtonYes = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]");
    // Кнопка «Да»

    public OrderFirefox(WebDriver driver) {
        this.driver = driver;
    }

    public void getFirefoxOrder() {
        driver.findElement(orderRightButton).click();
        driver.findElement(orderName).sendKeys("Иван");
        driver.findElement(orderSurname).sendKeys("Иванов");
        driver.findElement(orderAddress).sendKeys("г. Москва, ул. Ленина, д. 1, кв. 1");
        driver.findElement(orderMetro).sendKeys("ВДНХ");
        driver.findElement(listMetro).click();
        driver.findElement(orderPhone).sendKeys("+79001111111");
        driver.findElement(orderButtonMiddle).click();
        driver.findElement(orderFieldDate).sendKeys("01.01.2022");
        driver.findElement(orderFieldDate2).click();
        driver.findElement(orderListDate).click();
        driver.findElement(orderListDate2).click();
        driver.findElement(orderCheckColour).click();
        driver.findElement(orderButtonOrder).click();
        driver.findElement(orderButtonYes).click();
        String expected = "Посмотреть статус";
        String actual = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button")).getText();
        assertEquals("Заказ не оформлен", expected, actual);
    }
}