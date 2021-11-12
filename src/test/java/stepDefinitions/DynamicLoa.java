package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import testRunner.Driver;

public class DynamicLoa extends Driver {
    @When("I access Dynamic Loading page")
    public void i_access_dynamic_loading_page() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(14) > a")).click();
    }

    @When("I can use all features from Dynamic Loading")
    public void i_can_use_all_features_from_dynamic_loading() throws InterruptedException {
        driver.findElement(By.cssSelector("#content > div > a:nth-child(5)")).click();
        driver.findElement(By.cssSelector("#start > button")).click();

        Thread.sleep(5000);

        System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/h4")).getText());

        Thread.sleep(2000);

        driver.navigate().back();
        driver.findElement(By.cssSelector("#content > div > a:nth-child(8)")).click();
        driver.findElement(By.cssSelector("#start > button")).click();

        Thread.sleep(5000);

        System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/h4")).getText());

        driver.navigate().back();
        driver.navigate().back();


    }
}
