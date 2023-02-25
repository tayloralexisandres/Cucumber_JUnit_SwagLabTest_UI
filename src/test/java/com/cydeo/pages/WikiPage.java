package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage {

public WikiPage() {
    PageFactory.initElements(Driver.getDriver(), this);
}
  //  https://www.wikipedia.org/
    @FindBy(id = "searchInput")
            public WebElement searchbox;



}

