@regression @login
  Feature: Login

    Scenario: Login successful
      Given I login to "TRELLO" portal web with "TRELLO-USER-PASSWORD" credentials
      When I click on "Start Product Trello" button on "StartAtlassian" page
      Then Verify Boards page is displayed
