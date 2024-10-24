package org.example.pages;

import org.example.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class SearchGooglePages extends Driver {
    String driverName;

    public WebDriver driver = getDefaultDriver("chrome");

    public void goToGoogle() {
        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void searching(String keyword){
        driver.findElement(By.xpath("//textarea[@title='Telusuri']"))
                .sendKeys(keyword);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//textarea[@title='Telusuri']"))
                .sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void validateSearchResults(String keyword) {
        Assert.assertEquals(driver.findElement(By.xpath("//h3[contains(text(), 'Home - Bank BRI')]")).getText(),"Home - Bank BRI | Melayani Dengan Setulus Hatis");
    }
}
