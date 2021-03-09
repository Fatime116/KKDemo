package com.thirdEyeHealth.step_definitions;

import com.thirdEyeHealth.pages.BasePage;
import com.thirdEyeHealth.pages.LandingPage;
import com.thirdEyeHealth.pages.LoginPage;
import com.thirdEyeHealth.utils.ConfigurationReader;
import com.thirdEyeHealth.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateConsult {

    LoginPage loginPage = new LoginPage();

    LandingPage landingPage = new LandingPage();



    @Given("user on the log in page")
    public void user_on_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in")
    public void user_logs_in() {
        loginPage.login();
    }

    @When("user select {string} from the top most menu")
    public void user_select_from_the_top_most_menu(String string) {
    landingPage.clickModule(string);
    }
        @When("click the green Add Consult Reqeust button")
        public void click_the_green_button (){
        landingPage.clickAddConsultRequest();
    }

    @When("Select facility {string}")
    public void select_facility(String string) {
        landingPage.selectFacility(string);
    }

    @When("user select any nurse, patient, chief complaint, and clinician")
    public void user_select_any_nurse_patient_chief_complaint_and_clinician() {
        landingPage.selectNurse();
        landingPage.selectPt();
        landingPage.setCheifComplaint();
        landingPage.selectCilician();

    }
    @Then("user should be able to click Create Consult Request")
    public void user_should_be_able_to_click() {
        landingPage.clickConsultRequestButton();
    }

}
