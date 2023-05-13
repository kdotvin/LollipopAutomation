package com.lollipopautomation;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.lollipopautomation.Login;
import com.lollipopautomation.BookArrangement;
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

public class BookArrangementTest {
    Login login = new Login();
    BookArrangement book = new BookArrangement();

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
    public void bookArrangement() throws Exception {
        Thread.sleep(5000);

        login.loginBtn.click();
        login.email.sendKeys("pop@cars.com");
        login.password.sendKeys("Popup123!");
        login.logIn.click();
        Thread.sleep(3000);

        book.inbox.click();
        Thread.sleep(4000);
        open("http://localhost:3000/arr-doc?lid=Rzegq36bh2TZPQwS4DDN");
        Thread.sleep(3000);
        book.payNowBtn.click();
        Thread.sleep(50000);
//        book.cardNumberInput.click();
//        book.cardNumberInput.sendKeys("4242 4242 4242 4242");
//        Thread.sleep(500);
//        book.expiration.sendKeys("224");
//        Thread.sleep(500);
//        book.cvc.sendKeys("123");
//        Thread.sleep(500);
//        Select dropdown = new Select(book.country);
//        dropdown.selectByValue("United Arab Emirates");
//        Thread.sleep(2000);
//        book.payNow.click();
//        Thread.sleep(10000);

        book.logOut.click();

    }
}
