package com.qaacademy.module5.automation.core.ui.webdriver;

/**
 * Driver types enum.
 */
public enum WebDriverTypes {
  CHROME("CHROME");
  private final String word;

  /**
   * Initializes WebDriver types enum.
   *
   * @param word original word.
   */
  WebDriverTypes(final String word) {
    this.word = word;
  }

  /**
   * Gets the enum word value.
   *
   * @return original word.
   */
  public String val() {
    return word;
  }
}
