package com.thirdEyeHealth.pages;

import com.thirdEyeHealth.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LandingPage extends BasePage{


    @FindBy(id = "reqPermissionBtn")
    private WebElement requestPermissionButton;

    @FindBy(id = "btnAddConsultRequest")
    private WebElement addConsultRequestButton;

    @FindBy(css="select[id='ddlchatuserfacility']")
    private WebElement selectFacilityDropdown;

    @FindBy(xpath = "//table[@id='chatusers']//tr[2]/td[1]/label")
    private WebElement selectNurse;

    @FindBy(xpath = "//table[@id='patients']//tr[2]/td[1]/label")
    private WebElement selectPatient;

    @FindBy(xpath = "//select[@id='ddlchiefcomplaints']")
    private WebElement selectCheifComplaint;

    @FindBy(xpath = "//select[@id='ddlclinician']")
    private WebElement selectClinician;

    @FindBy(xpath = "//input[@id='btnCreateConsultRequest']")
    private WebElement createConsultRequestButton;


    public void clickAddConsultRequest(){


      requestPermissionButton.click();

        BrowserUtils.clickOnElement(addConsultRequestButton);
    }
    public void selectFacility(String facilityName){

        Select select= new Select(selectFacilityDropdown);
        select.selectByVisibleText(facilityName);

    }
    public void selectNurse(){
        BrowserUtils.clickOnElement(selectNurse);

    }
    public void selectPt(){
        BrowserUtils.clickOnElement(selectPatient);
    }
    public void setCheifComplaint(){
        Select select= new Select(selectCheifComplaint);
        select.selectByIndex(1);
    }
    public void selectCilician(){
        Select select= new Select(selectClinician);
        select.selectByIndex(2);
    }
    public void clickConsultRequestButton(){
        BrowserUtils.clickOnElement(createConsultRequestButton);
    }

}
