package com.qaacademy.module5.automation.trello.ui.steps;

import com.qaacademy.module5.automation.core.ui.portals.trello.helpers.LoginHelper;
import io.cucumber.java.en.Given;

public class LoginSteps {
  @Given("I login to {string} portal web with {string} credentials")
  public void iLoginToPortalWebWithCredentials(String portalWeb, String userType) {
    LoginHelper.loginUserInPortal(portalWeb, userType);
  }
}
