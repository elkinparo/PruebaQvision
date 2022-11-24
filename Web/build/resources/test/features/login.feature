# elkinparo@gmail.com


Feature: as a quality analyst
  I want to test the login flow to the page
  to confirm its correct operation

  @login
  Scenario: log in to the page
    Given  actor opens browser
    When  I send the username and password
    Then  look at the pets page
