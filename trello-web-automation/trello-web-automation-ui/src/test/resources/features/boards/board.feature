@regression @board
Feature: Create a new BOARD

  Background:
    Given I login to "TRELLO" portal web with "TRELLO-USER-PASSWORD" credentials
    And I click on "Start Product Trello" button on "StartAtlassian" page

  @deleteBoard
  Scenario: Create new board
    When I click on "Create_new_board" button
    And I fill "Board test auto" on board title field
    And I click on "create" button
    Then Verify "Board test auto" is displayed
