package com.qaacademy.module5.automation.core.ui.browser;

public interface Browser<T> {
  /**
   * Gets a Web Driver instance of a specific browser.
   *
   * @return Web Driver instance.
   */
  T getDriver();
}
