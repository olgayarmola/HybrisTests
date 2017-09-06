Feature: Login on site
  As a customer on the site I want to login to my account with my login and password

  @Regression
  Scenario: Verify that user can login on site by entering e-mail and password
   Given open "login" page
    When enter "olga.yarmola@zaelab.com" in the E-mail address field
    When enter "111111" in the Password field
    When click on the login button
    Then the user is logged in
