package com.qaacademy.module5.automation.core.ui.browser;

import com.qaacademy.module5.automation.core.ui.config.UiConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Objects;

/**
 * Initializes an instance of a Chrome web driver
 */
public class Chrome implements Browser<WebDriverManager> {

  protected static final String WEBDRIVER_VERSION = UiConfig.getInstance().getChromeDriverVersion();

  /**
   * Initializes an instance of {@link Chrome}.
   */
  public Chrome() {
    super();
  }

  /**
   * {@inheritDoc}
   */
  public WebDriverManager getDriver() {
    WebDriverManager webDriverManager;
    if (Objects.nonNull(WEBDRIVER_VERSION) && !WEBDRIVER_VERSION.isEmpty()) {
      webDriverManager = WebDriverManager.chromedriver()
            .driverVersion(WEBDRIVER_VERSION)
            .capabilities(getOptions());
    } else {
      webDriverManager = WebDriverManager.chromedriver().capabilities(getOptions());
    }
    webDriverManager.create();
    return webDriverManager;
  }

  private ChromeOptions getOptions(){
    ChromeOptions chromeOptions = new ChromeOptions();
    if(UiConfig.getInstance().isHeadlessMode()){
      chromeOptions.addArguments("--headless=new");
    }
    return chromeOptions;
  }
}
