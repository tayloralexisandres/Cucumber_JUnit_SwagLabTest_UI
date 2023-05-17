package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ButtonBasePAge {

    public ButtonBasePAge(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="Section_of_Buttons")
    public WebElement header;


    @FindBy(xpath = "//div[@class='et_pb_row et_pb_row_2 et_pb_row_4col']//a")
    public List<WebElement> buttonsAre12;

}
