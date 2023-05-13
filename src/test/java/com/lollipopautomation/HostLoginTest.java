package com.lollipopautomation;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.lollipopautomation.Login;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class HostLoginTest {
    Login login = new Login();

    @BeforeAll        public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach        public void setUp() {
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("http://127.0.0.1:3000");
    }

    @Test
    public void login() throws Exception {
        login.loginBtn.click();
        login.email.sendKeys("host@autobots.org");
        login.password.sendKeys("Hosty123!");
        login.logIn.click();
        Thread.sleep(3000);
        login.logOut.click();
    }
}
