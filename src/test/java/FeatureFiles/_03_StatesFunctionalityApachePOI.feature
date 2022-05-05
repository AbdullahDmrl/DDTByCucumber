Feature: Creating and deleting states by getting data from excel

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  @Regression
    Scenario: States Functionality
    And Navigate to states page and chose the country
    When User Create states with ApachePOI
    When User Delete states with ApachePOI
