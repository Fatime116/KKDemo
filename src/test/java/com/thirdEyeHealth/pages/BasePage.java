package com.thirdEyeHealth.pages;

import com.thirdEyeHealth.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickModule(String moduleName){

        Driver.getDriver().findElement(By.linkText(moduleName)).click();
    }


}
