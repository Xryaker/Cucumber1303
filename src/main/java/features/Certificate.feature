@CERTIFICATE
Feature: CheckCert

  Scenario: Positive chek
    When I send certificate number "45924126"
    Then Verification  certificate "true"

  Scenario: Positive chek
    When I send certificate number "45126"
    Then Verification  certificate "false"

  Scenario: Negative chek
    When I send certificate number "45126"
    Then Verification  certificate "true"