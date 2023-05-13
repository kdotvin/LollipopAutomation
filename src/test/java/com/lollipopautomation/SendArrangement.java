package com.lollipopautomation;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SendArrangement {

    public SelenideElement inbox = $x("//*[name()='span' and text()='Inbox']");
    public SelenideElement popupOwner = $x("//*[name()='input' and contains(@placeholder, 'Popup Owner')]");
    public SelenideElement listingDropdown = $x("//*[name()='select' and @id='listingDropdown']");
    public SelenideElement sendArrBtn = $x("//*[name()='button' and @id='sendArrBtn']");
    public SelenideElement logOut = $x("//*[name()='button' and text()='Log out']");
}
