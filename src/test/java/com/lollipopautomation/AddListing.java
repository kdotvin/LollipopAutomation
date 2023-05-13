package com.lollipopautomation;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AddListing {
    public SelenideElement addListingBtn = $x("//*[name()='span' and text()='Add Listing']");
    public SelenideElement listingTitle = $x("//*[name()='input' and @id='listing-title-field']");
    public SelenideElement address = $x("//*[name()='input' and @placeholder='Address']");
    public SelenideElement city = $x("//*[name()='input' and @placeholder='City']");
    public SelenideElement state = $x("//*[name()='input' and @placeholder='State']");
    public SelenideElement zipcode = $x("//*[name()='input' and @placeholder='Zip Code']");
    public SelenideElement size = $x("//*[name()='input' and @placeholder='Size']");
    public SelenideElement compensation = $x("//*[name()='input' and @placeholder='Compensation']");
    public SelenideElement startDate = $x("(//*[name()='input' and @type='text'])[4]");
    public SelenideElement may25 = $x("(//*[name()='div' and contains(@aria-label,'Thursday, May 25th, 2023')])");
    public SelenideElement endDate = $x("(//*[name()='input' and @type='text'])[5]");
    public SelenideElement may29 = $x("(//*[name()='div' and contains(@aria-label,'Monday, May 29th, 2023')])");
    public SelenideElement ambience = $x("//*[name()='select' and @name='ambience']");
    public SelenideElement busProducts = $x("//*[name()='select' and @name='product']");
    public SelenideElement cancelDate = $x("(//*[name()='input' and @type='text'])[6]");
    public SelenideElement may24 = $x("(//*[name()='div' and contains(@aria-label,'Wednesday, May 24th, 2023')])");
    public SelenideElement addListing = $x("//*[name()='button' and text()='Next']");
    public SelenideElement chooseFile = $x("//*[name()='input' and @type='file']");
    public SelenideElement uploadImage = $x("//*[name()='button' and text()='Upload']");
    public SelenideElement finishImage = $x("//*[name()='button' and text()='Add Listing']");
    public SelenideElement logOut = $x("//*[name()='button' and text()='Log out']");

}
