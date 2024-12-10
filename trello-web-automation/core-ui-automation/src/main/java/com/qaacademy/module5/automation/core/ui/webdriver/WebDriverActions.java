package com.qaacademy.module5.automation.core.ui.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverActions {
  private final WebDriver wDriver;
  private final WebDriverWait wait;

  public WebDriverActions(WebDriver driver, WebDriverWait wait) {
    this.wDriver = driver;
    this.wait = wait;
  }

  public void click(final WebElement webElement) {
    wait.until(ExpectedConditions.elementToBeClickable(webElement));
    webElement.click();
  }

  public void click(final By locator) {
    wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
  }

  public String getText(final WebElement webElement) {
    wait.until(ExpectedConditions.visibilityOf(webElement));
    return webElement.getText();
  }

  public String getText(final By locator) {
    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
  }

  public void setValue(final WebElement webElement, final String value){
    this.wait.until(ExpectedConditions.visibilityOf(webElement));
    webElement.clear();
    webElement.sendKeys(value);
  }

  public boolean isElementDisplayed(WebElement webElement) {
    this.wait.until(ExpectedConditions.visibilityOf(webElement));
    return webElement.isDisplayed();
  }
}
