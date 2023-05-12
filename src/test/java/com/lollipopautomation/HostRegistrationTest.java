package com.lollipopautomation;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.lollipopautomation.Registration;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class HostRegistrationTest {
    Registration registration = new Registration();

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
        registration.registrationBtn.click();
        registration.fullNameInput.clear();
        registration.fullNameInput.click();
        registration.fullNameInput.sendKeys("Test Automation");
        registration.busNameInput.sendKeys("Autobots");
        registration.emailInput.sendKeys("optimusprime@autobots.org");
        registration.pwdInput.sendKeys("Autobots123!");
        registration.pwdConfirmInput.sendKeys("Autobots123!");
        registration.hostBtn.click();
        Thread.sleep(10000);
    }
}
