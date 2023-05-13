package com.lollipopautomation;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.lollipopautomation.Login;
import com.lollipopautomation.AddListing;
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

public class AddListingTest {
    Login login = new Login();
    AddListing add = new AddListing();

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
    public void addListing() throws Exception {
        Thread.sleep(5000);

        login.loginBtn.click();
        login.email.sendKeys("host@autobots.org");
        login.password.sendKeys("Hosty123!");
        login.logIn.click();
        Thread.sleep(3000);

        add.addListingBtn.click();
        Thread.sleep(500);
        add.listingTitle.sendKeys("Autobots");
        add.address.sendKeys("123 Optimus Prime Way");
        add.city.sendKeys("San Jose");
        add.state.sendKeys("CA");
        add.zipcode.sendKeys("55781");
        add.size.sendKeys("2200");
        Thread.sleep(500);
        add.compensation.sendKeys("1200");
        add.startDate.click();
        add.may25.click();
        add.endDate.click();
        add.may29.click();
        Thread.sleep(500);
        Select atmosphere = new Select(add.ambience);
        atmosphere.selectByIndex(1);
        Thread.sleep(500);
        Select products = new Select(add.busProducts);
        products.selectByIndex(8);
        add.cancelDate.click();
        add.may24.click();
        add.addListing.click();
        Thread.sleep(15000);

//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins=*");
//        WebDriver driver = new ChromeDriver(chromeOptions);

        //Click on the Import Button
        //Actions builder = new Actions(driver);
        //builder.moveToElement(driver.findElement(By.xpath("//*[name()='input' and @type='file']"))).click().build().perform();
        //add.chooseFile.click();
//        Thread.sleep(2000);
//
//        //File Need to be imported
//        File file = new File("autobots.jpeg");
//        StringSelection stringSelection= new StringSelection(file.getAbsolutePath());
//        //Copy to clipboard Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//
//        Robot robot = new Robot();
//        // Cmd + Tab is needed since it launches a Java app and the browser looses focus
//
//        robot.keyPress(KeyEvent.VK_META);
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_META);
//        robot.keyRelease(KeyEvent.VK_TAB);
//        robot.delay(500);
//        //Open Goto window
//
//        robot.keyPress(KeyEvent.VK_META);
//        robot.keyPress(KeyEvent.VK_SHIFT);
//        robot.keyPress(KeyEvent.VK_G);
//        robot.keyRelease(KeyEvent.VK_META);
//        robot.keyRelease(KeyEvent.VK_SHIFT);
//        robot.keyRelease(KeyEvent.VK_G);
//        //Paste the clipboard value
//
//        robot.keyPress(KeyEvent.VK_META);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_META);
//        robot.keyRelease(KeyEvent.VK_V);
//        //Press Enter key to close the Goto window and Upload window
//
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.delay(500);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//
        add.uploadImage.click();
        Thread.sleep(500);
        add.finishImage.click();

        Thread.sleep(5000);
        add.logOut.click();
    }
}
