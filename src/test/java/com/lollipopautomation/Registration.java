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
    public SelenideElement hostBtn = $x("(//*[contains(@class,'MuiButtonBase')])[2]");
    public SelenideElement popupBtn = $x("(//*[contains(@class,'MuiButtonBase')])[1]");
    public SelenideElement signUp = $x("//*[name()='button' and text()='Sign Up']");
    public SelenideElement popupBusName = $x("//*[name()='input' and @placeholder='Business Name']");
    public SelenideElement ambience = $x("//*[name()='select' and @id='ambience']");
    public SelenideElement busProducts = $x("//*[name()='select' and @id='busProducts']");
    public SelenideElement busSize = $x("//*[name()='select' and @id='size']");
    public SelenideElement busDuration = $x("//*[name()='select' and @id='duration']");
    public SelenideElement busTimeFrame = $x("//*[name()='select' and @id='timeframe']");
    public SelenideElement busComp = $x("//*[name()='select' and @id='comp']");
    public SelenideElement yes = $x("//*[@value='yes']");
    public SelenideElement instagram = $x("//*[name()='input' and @placeholder='@...']");
    public SelenideElement facebook = $x("(//*[name()='input' and @placeholder='Link'])[1]");
    public SelenideElement etsy = $x("(//*[name()='input' and @placeholder='Link'])[2]");
    public SelenideElement nextBtn = $x("(//*[name()='button' and @id='submit-btn'])");
    public SelenideElement logOut = $x("//*[name()='button' and text()='Log out']");


}
