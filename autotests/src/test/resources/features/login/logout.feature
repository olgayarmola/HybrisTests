Feature: Logout from site
  As a customer of the site I want to logout from my account

  @Regression, @Smoke
    Scenario: Verify that user can log out from his account anytime without errors
    Given user with email "olga.yarmola@zaelab.com" and password "111111" logged in on any page
    When click on the Sign Out link
    Then user is logged out