package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import testRunner.Driver;

public class Form_Auth extends Driver
{
    @When("I access Login  page")
    public void i_access_login_page() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(21) > a")).click();
    }
    @When("I can login with valid username and pwd")
    public void i_can_login_with_valid_username_and_pwd() throws InterruptedException {
        driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#login > button > i")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#content > div > a > i")).click();
        driver.navigate().back();

    }

}
