@smoke
Feature: User could search for any product

  Background:
    Given user could login by "toka.adel@gmail.com" and "258369"

    Scenario: Logged User could search for any product
     When user go to search box And enter "shoes"
     Then click search button
     And user could see search result page
