package com.lollipopautomation;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BookArrangement {
    public SelenideElement inbox = $x("//*[name()='span' and text()='Inbox']");
    public SelenideElement payNowBtn = $x("//*[name()='button' and text()='PAY NOW']");
    public SelenideElement cardNumberInput = $x("//*[@id='Field-numberInput']");
    public SelenideElement expiration = $x("//*[@id='Field-expiryInput']");
    public SelenideElement cvc = $x("//*[@id='Field-cvcInput']");
    public SelenideElement country = $x("//*[@id='Field-countryInput']");
    public SelenideElement payNow = $x("//*[@id='button-text']");
    public SelenideElement logOut = $x("//*[name()='button' and text()='Log out']");
}
