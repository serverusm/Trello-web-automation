package com.qaacademy.module5.automation.core.ui.base;


import com.qaacademy.module5.automation.core.ui.environment.EnvironmentManager;
import com.qaacademy.module5.automation.core.ui.webdriver.WebDriverActions;
import com.qaacademy.module5.automation.core.ui.webdriver.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
  protected final WebDriver driver;
  protected final WebDriverWait wait;
  protected final EnvironmentManager environmentManager;
  protected final WebDriverActions action;

  public BasePage( ) {
    environmentManager = EnvironmentManager.getInstance();
    WebDriverManager webDriverManager = WebDriverManager.getInstance();
    driver = webDriverManager.getWebDriver();
    wait = webDriverManager.getWebDriverWait();
    action = new WebDriverActions(driver, wait);
    PageFactory.initElements(driver, this);
  }
}
