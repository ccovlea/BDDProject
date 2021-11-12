package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import testRunner.Driver;

import javax.swing.*;
import java.awt.*;

public class FloatingMenu extends Driver {
    @When("I access Floating Menu page")
    public void i_access_floating_menu_page() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(19) > a")).click();
    }
    @When("I can see Floating Menus when i scroll down")
    public void i_can_see_floating_menus_when_i_scroll_down() throws InterruptedException {
       boolean status1 = driver.findElement(By.cssSelector("#menu > ul > li:nth-child(1) > a")).isDisplayed();
       assert status1;
        boolean status2 = driver.findElement(By.cssSelector("#menu > ul > li:nth-child(2) > a")).isDisplayed();
        assert status2;
        boolean status3 = driver.findElement(By.cssSelector("#menu > ul > li:nth-child(3) > a")).isDisplayed();
        assert status3;
        boolean status4 = driver.findElement(By.cssSelector("#menu > ul > li:nth-child(4) > a")).isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement( driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div"))).perform();
        Thread.sleep(5000);


        driver.navigate().back();


    }

}
