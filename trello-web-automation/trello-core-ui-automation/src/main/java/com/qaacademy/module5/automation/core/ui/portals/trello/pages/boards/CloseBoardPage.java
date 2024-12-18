package com.qaacademy.module5.automation.core.ui.portals.trello.pages.boards;

import com.qaacademy.module5.automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloseBoardPage extends BasePage {
  //Locators
  @FindBy(css = "button[data-testid='close-board-delete-board-button']")
  WebElement permanentlyDeleteBoardLinkButton;
  @FindBy(css = "button[data-testid='close-board-delete-board-confirm-button']")
  WebElement deleteButton;

  //Methods
  public void clickOnPermanentlyDeleteBoardLinkButton() {
    action.click(permanentlyDeleteBoardLinkButton);
  }

  public void clickOnDeleteButton() {
    action.click(deleteButton);
  }
}
