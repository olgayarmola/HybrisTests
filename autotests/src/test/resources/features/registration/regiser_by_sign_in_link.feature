Feature: Registration of new user on site
  
  @Regression
  Scenario: Verify that user can register on site by submitting registration form
    Given open "registration" page
    When select "MS." title in the Title dropdown
    