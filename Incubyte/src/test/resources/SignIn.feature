Feature: Create Account on SoftwareTestingBoard

  Scenario: To validate Create Account functionality on SoftwareTestingBoard
    Given Open "https://magento.softwaretestingboard.com/"
    When Click on Create Account link
    When Enter first Name as "Omkar"
    When Enter last name as "Sangram"
    When Enter emailid as "OmkarSangram7890@gmail.com"
    When Enter Password as "OmkarS@123"
    When Enter Confirm Password as "OmkarS@123"
    And Click on Create a Account button
    Then Account should created
