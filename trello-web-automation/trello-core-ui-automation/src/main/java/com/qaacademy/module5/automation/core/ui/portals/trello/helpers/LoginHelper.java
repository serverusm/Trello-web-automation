package com.qaacademy.module5.automation.core.ui.portals.trello.helpers;

import com.qaacademy.module5.automation.core.ui.environment.EnvironmentManager;
import com.qaacademy.module5.automation.core.ui.portals.trello.pages.login.LoginFactory;
import com.qaacademy.module5.automation.core.ui.portals.trello.pages.login.LoginPage;
import com.qaacademy.module5.automation.core.ui.portals.trello.pages.login.PortalWeb;
import com.qaacademy.module5.automation.core.ui.portals.trello.pages.login.UserTypes;

import java.util.Arrays;
import java.util.stream.Stream;

public final class LoginHelper {
  private LoginHelper(){}

  public static void loginUserInPortal(String portalWeb, String userType) {
    var index = 0;
    Stream<PortalWeb> portalWebStream =
          Arrays.stream(PortalWeb.values()).filter(pw -> pw.val().equalsIgnoreCase(portalWeb));
    Stream<UserTypes> userTypesStream =
          Arrays.stream(UserTypes.values()).filter(u -> u.val().equalsIgnoreCase(userType));
    loginUserInPortal(portalWebStream.toList().get(index), userTypesStream.toList().get(index));
  }

  public static void loginUserInPortal(PortalWeb portalWeb, UserTypes userType) {
    EnvironmentManager environmentManager = EnvironmentManager.getInstance();
    environmentManager.setPortalWeb(portalWeb.val());
    environmentManager.setUserType(userType.val());

    LoginPage loginUserPasswordPage = LoginFactory.createLoginPage(portalWeb, userType);
    loginUserPasswordPage.loginUserInPortal();
  }
}
