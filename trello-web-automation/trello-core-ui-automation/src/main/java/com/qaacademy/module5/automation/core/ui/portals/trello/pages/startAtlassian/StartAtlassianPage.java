package com.qaacademy.module5.automation.core.ui.portals.trello.pages.startAtlassian;

import com.qaacademy.module5.automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartAtlassianPage extends BasePage {

  @FindBy(xpath = "//div[@id='ProductHeadingSuffix']/h5")
  private WebElement subTitleLabel;
  public boolean isSwitchToLabelDisplayed(){
    return action.isElementDisplayed(subTitleLabel);
  }
}