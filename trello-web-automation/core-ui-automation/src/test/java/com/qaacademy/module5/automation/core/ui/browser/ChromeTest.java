package com.qaacademy.module5.automation.core.ui.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Chrome Browser Test")
class ChromeTest {
  public static final String GOOGLE_URL = "https://www.google.com/";
  public static final String GOOGLE = "Google";
  private Chrome chrome;
  private WebDriverManager webDriver;

  @BeforeEach
  void setup() {
    WebDriverManager.chromedriver().setup();
    chrome = new Chrome();// Start chrome
  }

  @AfterEach
  void teardown() {
    webDriver.quit();
  }

  @Test
  @DisplayName("Verifies if getDriver call is not null")
  void verifesIfGetDriverCAllIsNotNull() {
    webDriver = chrome.getDriver();
    assertNotNull(webDriver);
  }

  @Test
  @DisplayName("Verifies if browser is opening")
  void verifiesIfBrowserIsOpening() {
    webDriver = chrome.getDriver();
    webDriver.getWebDriver().navigate().to(GOOGLE_URL);
    assertTrue(webDriver.getWebDriver().getTitle().contains(GOOGLE));
  }
}
