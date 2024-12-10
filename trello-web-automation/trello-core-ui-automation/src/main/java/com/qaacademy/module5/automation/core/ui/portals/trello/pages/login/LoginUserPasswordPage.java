package com.qaacademy.module5.automation.core.ui.portals.trello.pages.login;

import com.qaacademy.module5.automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginUserPasswordPage extends BasePage implements LoginPage {
  @FindBy(id = "username")
  private WebElement userNameTxt;
  @FindBy(id = "login-submit")
  private WebElement loginBtn;
  @FindBy(id = "password")
  private WebElement passwordTxt;

  /**
   * {@inheritDoc}
   */
  @Override
  public void loginUserInPortal() {
    driver.navigate().to(environmentManager.getLoginUrl());
    action.setValue(userNameTxt, environmentManager.getUsername());
    action.click(loginBtn);
    action.setValue(passwordTxt, environmentManager.getPassword());
    action.click(loginBtn);
  }
}
