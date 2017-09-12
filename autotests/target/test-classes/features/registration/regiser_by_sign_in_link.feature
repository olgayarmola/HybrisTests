Feature: Registration of new user on site
  
  @Regression
  Scenario: Verify that user can register on site by submitting registration form
    Given open registration page
    When select "Miss" title in the Title dropdown
    When enter first name "Olga" in the First Name field
    When enter last name "Yarmola" in the Last Name field
    When enter e-mail "olga.yarmola@zaelab.com" in the Email Address field
    When enter password "111111" in the Password filed
    When confirm password "111111" in the Confirm Password field
    When click on the Register button
    Then user is registered
    