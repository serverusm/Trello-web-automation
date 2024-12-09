package com.qaacademy.module5.automation.core.ui.webdrivers;

//import io.github.bonigarcia.wdm.WebDriverManager;

import com.qaacademy.module5.automation.core.ui.webdriver.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.*;

class WebDriverManagerTest {
  public static final String GOOGLE_URL = "https://www.google.com/";
  public static final String TRELLO_URL = "https://trello.com/";
  public static final String GOOGLE = "Google";
  private WebDriverManager webDriverManager;

  @BeforeEach
  void setup() {
    webDriverManager = WebDriverManager.getInstance();
  }

  @AfterEach
  void teardown() {
    if (webDriverManager.getWebDriver() != null) {
      webDriverManager.quitWebDriver();
    }
  }

  @Test
  @DisplayName("Verifies if WebDriver quit")
  @Tag("unittest")
  void quitWebDriver() {
    webDriverManager.quitWebDriver();

    assertNull(webDriverManager.getWebDriver());
  }

  @Test
  @DisplayName("Verifies if webDriver is not null")
  @Tag("unitTest")
  void getWebDriver() {
    assertNotNull(webDriverManager.getWebDriver());
  }

  @Test
  @DisplayName("Verifies if WebDriver is not null")
  @Tag("UnitTest")
  void getWebDriverWait() {
    assertNotNull(webDriverManager.getWebDriverWait());
  }

  @Test
  @DisplayName("Gets Current Page Title")
  @Tag("UnitTest")
  void getCurrentPageTitle() {
    webDriverManager.getWebDriver().navigate().to(GOOGLE_URL);
    assertEquals(webDriverManager.getCurrentPageTitle(), GOOGLE);
  }

  @Test
  @DisplayName("Searches in Google")
  @Tag("UnitTest")
  void searchesInGoogle() {
    // Go to Google page
    webDriverManager.getWebDriver().navigate().to(GOOGLE_URL);

    //Find Search TextBox WebElement
    WebElement searchTextBox = WebDriverManager.getInstance().getWebDriver().findElement(By.id("APjFqb"));

    // Wait WebElement
    webDriverManager.getWebDriverWait().until(ExpectedConditions.visibilityOf(searchTextBox));

    // Fill Search TextBox
    searchTextBox.sendKeys("qa-academy");

    // Find Search Button
    WebElement searchButton = webDriverManager.getWebDriver().findElement(By.name("btnK"));

    // Wait WebElement
    webDriverManager.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchButton));

    // Click on Search Button
    searchButton.click();

    // Assertions
    WebElement qaAcademyLink = webDriverManager.getWebDriver().findElement(By.xpath("//h3[text()='QA Training']"));
    Assertions.assertEquals("QA Training", qaAcademyLink.getText());
  }

  @Test
  @DisplayName("Login trello")
  @Tag("UnitTest")
  void loginTrello() {
    // Go to Google page
    webDriverManager.getWebDriver().navigate().to(TRELLO_URL);
    WebElement loginButton = webDriverManager.getWebDriver().findElement(By.xpath("//a[@data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']"));
    webDriverManager.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginButton));
    loginButton.click();

    WebElement nameTextBox = WebDriverManager.getInstance().getWebDriver().findElement(By.xpath("//input[@id='username']"));
    nameTextBox.sendKeys(" ");

    WebElement submitButton = webDriverManager.getWebDriver().findElement(By.xpath("//button[@id='login-submit']"));
    webDriverManager.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(submitButton));
    submitButton.click();

    WebElement message = webDriverManager.getWebDriver().findElement(By.xpath("//div[@id='username-uid2-error']"));
    Assertions.assertEquals("Enter an email address", message.getText());
  }

}
