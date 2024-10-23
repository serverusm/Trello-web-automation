package com.qaacademy.module5.automation.core.ui.browser;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Chrome Browser Test")
class ChromeTest {
  public static final String GOOGLE_URL = "https://www.google.com/";
  public static final String GOOGLE = "Google";
  WebDriver driver;

  @BeforeAll
  static void setupAll() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  void setup() {
    driver = new ChromeDriver();
  }

  @AfterEach
  void teardown() {
    driver.quit();
  }

  @Test
  @DisplayName("Verifies if browser is opening")
  void test() {
    driver.navigate().to(GOOGLE_URL);
    assertTrue(driver.getTitle().contains(GOOGLE));
  }
}
