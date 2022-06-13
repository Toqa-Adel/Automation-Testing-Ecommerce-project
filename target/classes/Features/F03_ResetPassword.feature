@smoke
Feature: User could reset password successfully

  Background:
    Given user login to website by "toka.adel@gmail.com"


    Scenario: reset his/her password successfully
      When user click forget password
      And enter email "toka.adel@gmail.com"
      And user enter recover
      Then confirmation message appears


