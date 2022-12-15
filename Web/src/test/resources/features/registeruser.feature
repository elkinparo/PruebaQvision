# elkinparo@gmail.com


Feature: as a quality analyst
  I want to test the login flow to the page
  to confirm its correct operation

  @register
  Scenario: register user in the page
    Given  actor opens browser
    When  the actor is register in the page
    Then see home page
