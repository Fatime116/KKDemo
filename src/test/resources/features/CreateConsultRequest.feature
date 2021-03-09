@login
Feature: As a user I want to be able to create consult request
# this is a comment
#Background - test pre-condition
#  will be executed before every scenario in the particular feature file



  @interview
  Scenario: when user login with valid credential, user able to create consult
    Given user on the log in page
    When  user logs in
    And user select "Consult Requests" from the top most menu
    And click the green Add Consult Reqeust button
    And Select facility "ThirdEyeHealth - Technical Support"
    And user select any nurse, patient, chief complaint, and clinician
    Then user should be able to click Create Consult Request

