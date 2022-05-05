Feature: Creating and deleting countries with Datatable

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  @Regression
  Scenario:  Country Functionality
    And Click on the elements in the left nav
      | setupOne   |
      | parameters |
      | Countries  |
    And Click on the elements in the dialog content
      | addButton |
    When User sending the keys in dialog content
      | nameInput | Country1 |
      | codeInput | C1       |
    And Click on the elements in the dialog content
      | saveButton |
    Then Success message should be displayed
    And Click on the elements in the dialog content
      | addButton |
    When User sending the keys in dialog content
      | nameInput | Country2 |
      | codeInput | C2       |
    And Click on the elements in the dialog content
      | saveButton |
    Then Success message should be displayed
    And Click on the elements in the dialog content
      | addButton |
    When User sending the keys in dialog content
      | nameInput | Country3 |
      | codeInput | C3       |
    And Click on the elements in the dialog content
      | saveButton |
    Then Success message should be displayed

    When User sending the keys in dialog content
      | searchInput | Country1 |
    And Click on the elements in the dialog content
      | searchButton     |
      | deleteButton     |
      | confirmDeleteBtn |
    Then Success message should be displayed
    When User sending the keys in dialog content
      | searchInput | Country2 |
    And Click on the elements in the dialog content
      | searchButton     |
      | deleteButton     |
      | confirmDeleteBtn |
    Then Success message should be displayed
    When User sending the keys in dialog content
      | searchInput | Country3 |
    And Click on the elements in the dialog content
      | searchButton     |
      | deleteButton     |
      | confirmDeleteBtn |
    Then Success message should be displayed