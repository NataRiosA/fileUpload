package com.indra.actions;


import com.indra.pages.UploadPage;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;


@DefaultUrl("https://webdriveruniversity.com/File-Upload/index.html?")

public class UploadActions extends UploadPage {
    public UploadActions(WebDriver driver) {
        super(driver);
    }

    public void FileUpload(){
        getMyFile().waitUntilClickable().sendKeys("C:\\Users\\nriosa\\Desktop\\Prueba.txt");
    }

    public void sendFile(){
        FileUpload();
        getSend().click();
    }

    public void compare(){
        MatcherAssert.assertThat(" Your file has now been uploaded!",
                Matchers.equalTo(" Your file has now been uploaded!"));
    }
}
