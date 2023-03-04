package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CrmPage {
    public CrmPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = " //span[.='']")
    public WebElement verifyName;

        @FindBy(xpath = "//input[@id='login']")
        public WebElement userName;

        @FindBy(xpath = "//input[@id='password']")
        public WebElement password;
        @FindBy(xpath = "//button[@type='submit']")
        public WebElement submit;
        @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li/a/span")
        public List<WebElement> mainmenu;
        @FindBy(tagName = "span")
        public List<WebElement> names;
    @FindBy(xpath = "(//span[@class='oe_menu_text'])[5]")
    public WebElement salesBtn;



    }

