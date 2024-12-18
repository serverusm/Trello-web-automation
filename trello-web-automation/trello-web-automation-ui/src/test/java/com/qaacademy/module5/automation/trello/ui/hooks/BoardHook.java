package com.qaacademy.module5.automation.trello.ui.hooks;

import com.qaacademy.module5.automation.core.ui.portals.trello.pages.boards.BoardMenuPage;
import com.qaacademy.module5.automation.core.ui.portals.trello.pages.boards.BoardsPage;
import com.qaacademy.module5.automation.core.ui.portals.trello.pages.boards.CloseBoardPage;
import io.cucumber.java.After;

public final class BoardHook {

  @After("@deleteBoard")
  public void deleteBoard(){
    BoardsPage boardsPage = new BoardsPage();
    boardsPage.clickOnShowMenuBoardButton();
    BoardMenuPage boardMenuPage = new BoardMenuPage();
    boardMenuPage.clickOnCloseBoardButton();
    boardMenuPage.clickOnCloseButton();
    CloseBoardPage closeBoardPage = new CloseBoardPage();
    closeBoardPage.clickOnPermanentlyDeleteBoardLinkButton();
    closeBoardPage.clickOnDeleteButton();
  }
}
