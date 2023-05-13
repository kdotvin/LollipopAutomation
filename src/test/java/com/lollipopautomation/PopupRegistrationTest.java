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
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class PopupRegistrationTest {
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
        registration.fullNameInput.sendKeys("Poppy Test");
        Thread.sleep(500);
        registration.busNameInput.sendKeys("Pop Car Store");
        Thread.sleep(500);
        registration.emailInput.sendKeys("pop@cars.com");
        Thread.sleep(500);
        registration.pwdInput.sendKeys("Popup123!");
        Thread.sleep(500);
        registration.pwdConfirmInput.sendKeys("Popup123!");
        Thread.sleep(500);
        registration.popupBtn.click();
        Thread.sleep(3000);
        registration.signUp.click();

        registration.popupBusName.sendKeys("Pop Car Store");
        Select atmosphere = new Select(registration.ambience);
        atmosphere.selectByValue("Casual");
        Thread.sleep(500);
        Select products = new Select(registration.busProducts);
        products.selectByValue("Recreational equipment");
        Thread.sleep(500);
        Select size = new Select(registration.busSize);
        size.selectByIndex(1);
        Thread.sleep(500);
        Select duration = new Select(registration.busDuration);
        duration.selectByIndex(1);
        Thread.sleep(500);
        Select timeframe = new Select(registration.busTimeFrame);
        timeframe.selectByIndex(1);
        Thread.sleep(500);
        registration.yes.click();
        Thread.sleep(500);
        registration.instagram.sendKeys("@popcarstore");
        Thread.sleep(500);
        registration.facebook.sendKeys("facebook.com/PopCarStore");
        Thread.sleep(500);
        registration.etsy.sendKeys("etsy.com/PopCarStore");
        Thread.sleep(500);
        registration.nextBtn.click();
        Thread.sleep(5000);
        registration.logOut.click();
    }




}
