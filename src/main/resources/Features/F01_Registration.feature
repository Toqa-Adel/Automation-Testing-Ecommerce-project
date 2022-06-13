@smoke

Feature: User could register with valid data

  Scenario: user Register successfully
    Given user go to registration page
    When user enter "Toqa" and "Adel" and "toka.adel@gmail.com" and "258369" and "258369"
    And user clicks on register button
    Then user could register successfully
    And return to homepage
