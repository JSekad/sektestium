package dev.slnm.loginTests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;

public class TestAtLogin {
    @Test
    void try_first_login() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.getTitle();
        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        textBox.sendKeys("Selenium");
        submitButton.click();
        driver.quit();
    }

    @Test
    void select_spitogatos_kolonos_ampelokipoi(){
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.spitogatos.gr/pwliseis-katoikies/pollaples_perioxes-2051,2007/timi_apo-60000/timi_eos-80000/emvado_apo-55");
        List<WebElement> webElements = driver.findElements(By.xpath( "//a[contains(@href, '/aggelia/') and contains(@class, 'tile__link')]"));
        for (WebElement webElement : webElements) {

            String href = webElement.getAttribute("href");
            ((JavascriptExecutor) driver).executeScript("window.open(arguments[0], '_blank');", href);
        }


    }



}
