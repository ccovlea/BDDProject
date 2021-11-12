package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import testRunner.Driver;

public class DropDown extends Driver{
    @When("I select Dropdown")
    public void i_select_dropdown() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(11) > a")).click();
    }

    @When("I can access all the options on dropdown")
    public void i_can_access_all_the_options_on_dropdown() throws InterruptedException {
        driver.findElement(By.cssSelector("#dropdown")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#dropdown > option:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#dropdown")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#dropdown")).click();
        driver.findElement(By.cssSelector("#dropdown > option:nth-child(3)")).click();
        Thread.sleep(2000);
        driver.navigate().back();}
}
