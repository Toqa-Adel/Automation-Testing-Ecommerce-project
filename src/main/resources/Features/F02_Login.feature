@smoke

Feature: User could log in with valid email and password
Background:
  Given user navigates login page


  Scenario: user login successfully
    When user login with "toka.adel@gmail.com" and "258369"
    And user click on login button
    Then user could login successfully
    And redirected to homepage

