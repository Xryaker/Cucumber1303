@Koputa
@ROGA
@CERTIFICATE
Feature: Button test on main page

  Scenario: Check open page function
    When I open site
    And Click consultation button
    Then Check open form

  Scenario: check title
    When I open site
    Then Check title

  Scenario: Check blogbutton function
    When I open site "https://dnipro.ithillel.ua/"
    And I sent Name "Vasiliy" and Family "Shevchenko"


