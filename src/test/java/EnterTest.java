import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EnterTest {
    @Test
    public void testEnter() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.trexer.ru/auth/login");
        Thread.sleep(500);
        WebElement emailLabel = driver.findElement(By.cssSelector("input"));
        emailLabel.sendKeys("prodigy.u1@mail.ru");

        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        Assert.assertTrue(submitButton.isDisplayed(), "Элемент не активен");
        driver.quit();
    }
}
