@WIKI
@CERTIFICATE
Feature: wikitest

  Scenario Outline:
    When I open site "<LAN>" and "wikipedia.org"
    Then chcke button read "<READ>"
    Then chcke button Sousre "<SOURSE>"
    Then chcke button History "<HISTORY>"
    Examples:
      | LAN | READ   | SOURSE          | HISTORY             |
      | uk  | Читати | Переглянути код | Переглянути історію |
      | en  | Read   | View source     | View history        |