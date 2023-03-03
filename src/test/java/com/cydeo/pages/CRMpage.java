package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CRMpage {
    public CRMpage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")


    public WebElement verifyName;

    public void nameVisible(String username) {
        WebElement user = Driver.getDriver().findElement(By.xpath("//span[.='" + username + "']"));
        String actual=user.getText();
        Assert.assertTrue(username.contains(actual));


    }




@FindBy(xpath = " //span[.='POSManager5']")
public WebElement verifyNamePos;

@FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/thead/tr/th")
public List<WebElement> coulmns;

@FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//thead/tr/th")
public List<WebElement> repaircolumns;
@FindBy(xpath = "(//span[@class='oe_menu_text'])[5]")
public WebElement salesBtn;

@FindBy(xpath = "//li[.='Repair Orders']")
public WebElement repairOrders;
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

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> textList = new ArrayList<>();
        for (WebElement webElement : list) {
            textList.add(webElement.getText());
        }
        return textList;
    }

    public void clickOption(String optionText) {
        Driver.getDriver().findElement(By.partialLinkText(optionText)).click();
    }

    public void hoverOverElement(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
        BrowserUtils.sleep(2);
    }
}
