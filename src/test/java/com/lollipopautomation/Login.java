package com.lollipopautomation;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Login {
    public SelenideElement loginBtn = $x("//*[name()='button' and text()='Login']");
    public SelenideElement email = $x("//*[name()='input' and @name='email']");
    public SelenideElement password = $x("//*[name()='input' and @name='password']");
    public SelenideElement logIn = $x("//*[text()='Log in' and @class='btn-white-bg']");
    public SelenideElement logOut = $x("//*[name()='button' and text()='Log out']");

}
