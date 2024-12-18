package com.qaacademy.module5.automation.core.ui.portals.trello.pages.boards;

import com.qaacademy.module5.automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardsPage extends BasePage {
//Locators
  @FindBy(css = "h3.boards-page-section-header-name")
  WebElement workSpaceLabel;
  @FindBy(css = "h1[data-testid='board-name-display']")
  WebElement boardTitleLabel;
  @FindBy(css = "button[aria-label='Show menu']")
  WebElement showMenuBoardButton;

  //Methods
  public boolean isWorkSpaceLabelDisplayed() {
    return action.isElementDisplayed(workSpaceLabel);
  }

  public boolean isBoardTitleDisplayed(String boardTitle) {
    if(action.isElementDisplayed(boardTitleLabel)){
      return boardTitleLabel.getText().equalsIgnoreCase(boardTitle);
    }
    return false;
  }

  public void clickOnShowMenuBoardButton() {
    action.click(showMenuBoardButton);
  }
}
