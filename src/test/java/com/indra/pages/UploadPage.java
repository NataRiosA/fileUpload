package com.indra.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://webdriveruniversity.com/File-Upload/index.html?")

public class UploadPage extends PageObject {
    public UploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[contains(@id,'myFile')]")
    private WebElementFacade myFile;

    @FindBy(xpath = "//input[contains(@id,'submit-button')]")
    private WebElementFacade send;

    public WebElementFacade getMyFile() {
        return myFile;
    }

    public WebElementFacade getSend() {
        return send;
    }
}

