package com.qaacademy.module5.automation.trello.ui.steps;

import com.qaacademy.module5.automation.core.ui.portals.trello.pages.boards.BoardsPage;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class BoardsSteps {
  @Then("Verify Boards page is displayed")
  public void verifyBoardsPageIsDisplayed() {
    BoardsPage boardsPage = new BoardsPage();
    Assertions.assertTrue(boardsPage.isWorkSpaceLabelDisplayed());
  }
}
