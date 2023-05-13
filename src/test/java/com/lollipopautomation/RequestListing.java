package com.lollipopautomation;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RequestListing {
    public SelenideElement search = $x("//*[name()='img' and @id='search-icon']");
    public SelenideElement autobotsCard = $x("//*[text()='Autobots']/ancestor::node()[3]");
    public SelenideElement requestNowBtn = $x("//*[text()='Request now']");
    public SelenideElement confirmRequestBtn = $x("//*[text()='Request Booking']");
    public SelenideElement sendRequestBtn = $x("//*[text()='Send Request Confirmation']");
    public SelenideElement logOut = $x("//*[name()='button' and text()='Log out']");
}
