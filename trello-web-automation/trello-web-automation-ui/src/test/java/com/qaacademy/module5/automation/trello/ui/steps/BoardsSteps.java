package com.qaacademy.module5.automation.trello.ui.steps;

import com.qaacademy.module5.automation.core.ui.portals.trello.pages.boards.BoardsPage;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;

import java.util.PrimitiveIterator;

public class BoardsSteps {

  private final BoardsPage boardsPage;
   public BoardsSteps(){
     boardsPage = new BoardsPage();
   }
  @Then("Verify Boards page is displayed")
  public void verifyBoardsPageIsDisplayed() {
    BoardsPage boardsPage = new BoardsPage();
    Assertions.assertTrue(boardsPage.isWorkSpaceLabelDisplayed());
  }

  @Then("Verify {string} is displayed")
  public void verifyIsDisplayed(String boardTitle) {
    Assert.assertTrue(boardsPage.isBoardTitleDisplayed(boardTitle));
  }
}
