package com.qaacademy.module5.automation.trello.core.ui.portals.trello.pages.login;

import com.qaacademy.module5.automation.core.ui.environment.EnvironmentManager;
import com.qaacademy.module5.automation.core.ui.portals.trello.pages.login.LoginUserPasswordPage;
import com.qaacademy.module5.automation.core.ui.portals.trello.pages.login.PortalWeb;
import com.qaacademy.module5.automation.core.ui.portals.trello.pages.login.UserTypes;
import com.qaacademy.module5.automation.core.ui.portals.trello.pages.startAtlassian.StartAtlassianPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Login User and Password Page Test")
public class LoginUserPasswordPageTest {
  @Test
  void loginUserInPortal(){
    //Given
    EnvironmentManager environmentManager = EnvironmentManager.getInstance();
    environmentManager.setPortalWeb(PortalWeb.TRELLO.val());
    environmentManager.setUserType(UserTypes.TRELLO_USER_PASSWORD.val());

    //When
    LoginUserPasswordPage loginUserPasswordPage = new LoginUserPasswordPage();
    loginUserPasswordPage.loginUserInPortal();

    //Then
    StartAtlassianPage startAtlassianPage = new StartAtlassianPage();
    Assertions.assertTrue(startAtlassianPage.isSwitchToLabelDisplayed());//isG'dayServeruskToLabelDisplayed
  }

}
