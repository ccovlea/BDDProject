package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import testRunner.Driver;


public class DynamicCon extends Driver {
    @When("I access Dynamic Controls page")
    public void i_access_dynamic_controls_page() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(13) > a")).click();
    }

    @When("I can use all features from Dynamic Control")
    public void i_can_use_all_features_from_dynamic_control() throws InterruptedException {
        driver.findElement(By.cssSelector("#checkbox > input[type=checkbox]")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#checkbox-example > button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#checkbox-example > button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#checkbox")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#input-example > button")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#input-example > input[type=text]")).sendKeys("Test");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#input-example > button")).click();
        driver.navigate().back();


    }

}
