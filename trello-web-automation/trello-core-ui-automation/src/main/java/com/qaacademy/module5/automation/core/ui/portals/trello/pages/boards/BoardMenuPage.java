package com.qaacademy.module5.automation.core.ui.portals.trello.pages.boards;

import com.qaacademy.module5.automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardMenuPage extends BasePage {
//Locators
  @FindBy(xpath = "//div[text()='Close board']")
  WebElement closeBoardButton;
  @FindBy(css = "button[title='Close']")
  WebElement closeButton;
  //Methods
  public void clickOnCloseBoardButton() {
    action.click(closeBoardButton);
  }

  public void clickOnCloseButton() {
    action.click(closeButton);
  }
}
