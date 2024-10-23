package com.qaacademy.module5.automation.core.ui.webdrivers;

import com.qaacademy.module5.automation.core.ui.webdriver.WebDriverFactory;
import com.qaacademy.module5.automation.core.ui.webdriver.WebDriverTypes;
import org. junit. jupiter.api.AfterEach;
import org. junit. jupiter.api.DisplayName;
import org. junit.jupiter.api.Tag;
import org. junit.jupiter.params. ParameterizedTest;
import org. junit. jupiter.params.provider. EnumSource;
import org.openqa.selenium.WebDriver;

import static org. junit.jupiter.api.Assertions.assertNotNull;

@DisplayName(("WebDriver Factory Test"))
class WebDriverFactoryTest {
  private WebDriver webDriver;

  @AfterEach
  void teardown(){ webDriver.quit();}

  @ParameterizedTest
  @EnumSource
  @DisplayName("Verifies if getDriver call is not null")
  @Tag("UniTest")
  void verifiesIfGetDriverCallIsNotNull(final WebDriverTypes webDriverTypes){
    webDriver = WebDriverFactory.getWebDriverManager(webDriverTypes).getWebDriver();
    assertNotNull(webDriver);
  }
}