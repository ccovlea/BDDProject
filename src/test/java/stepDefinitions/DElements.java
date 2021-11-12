package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testRunner.Driver;

public class DElements extends Driver {
    @When("I select Disappearing Elements")
    public void i_select_disappearing_elements() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(9) > a")).click();
    }

    @When("I can access all the buttons")
    public void i_can_access_all_the_buttons() {
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(9) > a")).click();
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > a")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > a")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(4) > a")).click();
        driver.navigate().back();
        driver.navigate().back();
    }

}
