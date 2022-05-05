Feature: Creating and deleting citizenship with scenario outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  @Regression
  Scenario Outline: Citizenship Functionality

    And Navigate to Citizenship page
    When User Create a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Success message should be displayed

    When User Create a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Already exist message should be displayed
    And  Click on close button

    When User delete the  "<CitizenshipName>"
    Then Success message should be displayed

    Examples:
      | CitizenshipName | ShortName |
      | Country1        | C1        |
      | Country2        | C2        |
      | Country3        | C3        |

