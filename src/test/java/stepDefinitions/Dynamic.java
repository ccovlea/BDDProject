package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import testRunner.Driver;

public class Dynamic extends Driver {
    @When("I access Dynamic Content page")
    public void i_access_dynamic_content_page() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(12) > a")).click();

    }
    @When("I can use all features")
    public void i_can_use_all_features() throws InterruptedException {
        driver.findElement(By.cssSelector("#content > div > p:nth-child(3) > a")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#content > div > p:nth-child(3) > a")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#content > div > p:nth-child(3) > a")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#content > div > p:nth-child(3) > a")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
    }
    @Then("I close window")
    public void i_close_window() {
       driver.quit();
    }

}
