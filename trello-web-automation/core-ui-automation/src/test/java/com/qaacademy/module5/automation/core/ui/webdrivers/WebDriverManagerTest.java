//package com.qaacademy.module5.automation.core.ui.webdrivers;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org. junit. jupiter.api .*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui. ExpectedConditions;
//
//import static org. junit. jupiter.api.Assertions .*;
//class WebDriverManagerTest {
//  public static final String GOOGLE_URL = "https://www.google.com/";
//  public static final String GOOGLE = "Google";
//  private WebDriverManager webDriverManager;
//  @BeforeEach
//  void setup(){webDriverManager=WebDriverManager.getInstance();}
//
//  @AfterEach
//  void teardown(){
//    if (webDriverManager.getWebDriver() != null){
//        webDriverManager.quitWebDriver();
//    }
//  }
//  @Test
//  @DisplayName("Verifies if WebDriver quit")
//  @Tag("unittest")
//  void quitWebDriver(){
//    webDriverManager.quitWebDriver();
//
//    assertNull(webDriverManager.getWebDriver());
//  }
//
//  @Test
//  @DisplayName("Verifies if webDriver is not null")
//  @Tag("unitTest")
//  void getWebDriver(){assertNotNull(webDriverManager.getWebDriver());}
//
//  @Test
//  @DisplayName("Verifies if WebDriver is not null")
//  @Tag("UnitTest")
//  void getWebDriverWait(){assertNotNull(webDriverManager.getWebDriverWait());}
//
//  @Test
//  @DisplayName("Gets Current Page Title")
//  @Tag("UnitTest")
//  void getCurrentPageTitle(){
//    webDriverManager.getWebDriver().navigate().to(GOOGLE_URL);
//    assertEquals(webDriverManager.getCurrentPageTitle(), GOOGLE);
//  }
//}
