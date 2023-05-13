package com.lollipopautomation;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.lollipopautomation.Registration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class HostRegistrationTest {
    Registration registration = new Registration();
    static WebDriver browser;

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
    public void register() throws Exception {
        Thread.sleep(5000);
        registration.registrationBtn.click();
        Thread.sleep(500);
        registration.fullNameInput.clear();
        registration.fullNameInput.click();
        Thread.sleep(500);
        registration.fullNameInput.sendKeys("Host Auto");
        Thread.sleep(500);
        registration.busNameInput.sendKeys("Autobots");
        Thread.sleep(500);
        registration.emailInput.sendKeys("host@autobots.org");
        Thread.sleep(500);
        registration.pwdInput.sendKeys("Hosty123!");
        registration.pwdConfirmInput.sendKeys("Hosty123!");
        Thread.sleep(500);
        registration.hostBtn.click();
        Thread.sleep(500);
        registration.signUp.click();
        Thread.sleep(5000);
        registration.logOut.click();
    }
}
