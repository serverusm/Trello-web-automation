package com.qaacademy.module5.automation.core.ui.base;


import com.qaacademy.module5.automation.core.ui.environment.EnvironmentManager;
import com.qaacademy.module5.automation.core.ui.webdriver.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
  protected final WebDriver webDriver;
  protected final WebDriverWait webDriverWait;
  protected final EnvironmentManager environmentManager;

  public BasePage( ) {
    environmentManager = EnvironmentManager.getInstance();
    WebDriverManager webDriverManager = WebDriverManager.getInstance();
    webDriver = webDriverManager.getWebDriver();
    webDriverWait = webDriverManager.getWebDriverWait();
    PageFactory.initElements(webDriver, this);
  }
}
