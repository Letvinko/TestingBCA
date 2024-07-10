package org.example.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    WebDriver driver;

    public WebDriver getDefaultDriver(String driverDefault) {
        return switch (driverDefault) {
            case "firefox" -> this.driver = new FirefoxDriver();
            case "edge" -> this.driver = new EdgeDriver();
            default -> this.driver = new ChromeDriver();
        };
    }

    public void quitDriver(){
        driver.quit();
    }

}
