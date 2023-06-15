@Example
@vasiliy
@WIKI
@CERTIFICATE
Feature: Some Title

  Scenario: Some title
    When Print some text
    Then Result

  @Vasiliy
  Scenario: test2
    When Print some text "Vasiliy"
    And Print some "Vasiliy" and "Shevchenko"

  Scenario: test3Table
    When Print some texts
      | Vasiliy |
      | Nikola  |
      | Olga    |

  Scenario: test4Table
    When print some table
      | Vasiliy | Shevchenko |
      | Nikolay | Ivanov     |

  Scenario Outline:
    When Isen login "<LOGIN>" and Pass "<PASS>"
    Then I check resul "<RESULT>"
    Examples:
      | LOGIN   | PASS   | RESULT |
      | Vasiliy | 236589 | true   |
      | Nikolay | 456877 | false  |
      | Oksana  | 458744 | true   |