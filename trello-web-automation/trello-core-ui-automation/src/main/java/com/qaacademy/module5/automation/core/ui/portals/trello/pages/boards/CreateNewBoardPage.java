package com.qaacademy.module5.automation.core.ui.portals.trello.pages.boards;

import com.qaacademy.module5.automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewBoardPage extends BasePage {
  @FindBy(css = "li[data-testid='create-board-tile']")
  WebElement createNewBoardButton;
  @FindBy(css = "input[data-testid='create-board-title-input']")
  WebElement boardTitleTextBox;
  @FindBy(css = "button[data-testid='create-board-submit-button']")
  WebElement createButton;
  public void clickOnCreateNewBoardButton() {
    action.click(createNewBoardButton);
  }

  public void fillOnBoardTitleField(String boardTitle) {
    action.setValue(boardTitleTextBox, boardTitle);
  }

  public void clickOnCreateButton() {
    action.click(createButton);
  }
}
