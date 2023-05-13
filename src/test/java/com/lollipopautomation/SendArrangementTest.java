package com.lollipopautomation;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.lollipopautomation.Login;
import com.lollipopautomation.SendArrangement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class SendArrangementTest {
    Login login = new Login();
    SendArrangement send = new SendArrangement();

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
    public void sendArrangement() throws Exception {
        Thread.sleep(5000);

        login.loginBtn.click();
        login.email.sendKeys("host@autobots.org");
        login.password.sendKeys("Hosty123!");
        login.logIn.click();
        Thread.sleep(3000);

        send.inbox.click();
        Thread.sleep(1000);
        send.popupOwner.sendKeys("Poppy Test");
        Thread.sleep(1000);
        Select dropdown = new Select(send.listingDropdown);
        dropdown.selectByIndex(1);
        Thread.sleep(1000);
        send.sendArrBtn.click();
        Thread.sleep(9000);

        send.logOut.click();

    }
}
