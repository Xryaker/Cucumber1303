@ROGA
@CERTIFICATE
Feature:

  Scenario Outline:
    When I open site "<SITE>"
    Then Title page
    Then sout "<NAME>"
    Examples:
      | SITE                             | NAME    |
      | https://dnipro.ithillel.ua/      | Vasiliy |
      | https://www.youtube.com/         | Oleg    |
      | https://www.google.com.ua/?hl=uk | Nikolay |
      | https://uk.wikipedia.org         | Oksana  |
