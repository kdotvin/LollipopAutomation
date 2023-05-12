package com.lollipopautomation;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Registration {
    public SelenideElement registrationBtn = $x("//*[name()='button' and text()='Register']");
    public SelenideElement fullNameInput = $x("//*[name()='input' and @id='fullname']");
    public SelenideElement busNameInput = $x("//*[name()='input' and @id='busname']");
    public SelenideElement emailInput = $x("//*[name()='input' and @id='email']");
    public SelenideElement pwdInput = $x("//*[name()='input' and @id='pwd']");
    public SelenideElement pwdConfirmInput = $x(" //*[name()='input' and @id='confirm-pwd']");
    public SelenideElement hostBtn = $x("//*[name()='button' and @value='host']");
    public SelenideElement popupBtn = $x("//*[name()='button' and @value='popup']");

}
