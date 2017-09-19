Feature: Password reset
  As a customer I want to have possibility to reset my password

  Scenario: Verify that user is able to see popup when click on forgot password link
    Given open login page
    When click on the forgot password link
    Then the reset password popup is shown

  @Pending
  Scenario: Verify that e-mail is sending to the user on changing password with reset link

  @Pending
  Scenario: Verify that user can enter new password by using reset link

  @Pending
  Scenario: Verify that user can login with new password