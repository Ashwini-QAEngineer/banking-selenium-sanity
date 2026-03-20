package com.ashwini.banking.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.*;
import org.testng.annotations.*;

public class SmokeTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions o = new ChromeOptions();
        o.addArguments("--headless=new","--no-sandbox","--disable-dev-shm-usage");
        driver = new ChromeDriver(o);
    }

    @Test(description="Banking app loads")
    public void testAppLoads() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        Assert.assertFalse(driver.getTitle().isEmpty(), "Page title should not be empty");
    }

    @AfterMethod
    public void tear
