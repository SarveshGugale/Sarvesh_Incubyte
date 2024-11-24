Feature: Signed In softwaretestingboard

  Scenario: Vefity that once account created then check able to signedIn in softwaretestingboard
    Given hit URL "https://magento.softwaretestingboard.com"
    When Click on Sign In
    When Enter creating account Email Address "OmkarSangram7890@gmail.com"
    When Enter creating account Password "OmkarS@123"
    And Click on SignIn
    Then Logged In successfully
