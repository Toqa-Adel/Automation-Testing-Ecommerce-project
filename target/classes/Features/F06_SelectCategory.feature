@smoke

Feature:selecting different Categories

  Background:
  Given user logged by "toka.adel@gmail.com" and "258369"

    Scenario: Logged user could select different Categories
      When user navigates to category and select category
      # for ex : electronics category and sub category camera
      Then user navigate to sub category
      And user could review category products