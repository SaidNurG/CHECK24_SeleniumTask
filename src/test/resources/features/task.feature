Feature: Selenium Task

  @wip
  Scenario:check whether the cookie "ppset=kreditkarte" is set in response headers.
    Given the user is on the check24 credit card result page
    When the user should see the cookie 'ppset=kreditkarte' is set in response headers
    And the user clicks on the first of the listed products which has the number one on its panel
    And the user fill in 'taskprepforCHECK24@gmail.com' as email
    And the user clicks on weiter button
    And the user clicks on als Gast fortfahren radio-button
    And the user clicks on weiter button
    Then the user should see error messages for all empty fields
    And the user should fill in all fields with valid values

      | Vorname             | Said           |
      | Nachname            | Gokce          |
      | Geburtsdatum        | 28.08.1993     |
      | Geburtsort          | Ulm            |
      | Familienstand       | Ledig          |
      | Staatsangehorigkeit | Deutschland    |
      | Strasse             | leipheimerstr. |
      | Hausnummer          | 44             |
      | Wohnsituation       | Eigenheim      |
      | Mobilnummer         | 01754927822    |

    And the user should click on weiter button
    Then the user should see the next form page without any error message

