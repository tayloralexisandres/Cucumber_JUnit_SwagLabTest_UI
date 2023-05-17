package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books_loginPage {
    public Books_loginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "input[@id='userName']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@id='login']")
    public WebElement loginButton;

    public void login(String user, String pass){
        this.inputUsername.sendKeys(user);
        this.inputPassword.sendKeys(pass);
        this.loginButton.click();
    }
}
