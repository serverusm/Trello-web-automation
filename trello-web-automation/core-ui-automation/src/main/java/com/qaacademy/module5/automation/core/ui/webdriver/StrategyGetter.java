package com.qaacademy.module5.automation.core.ui.webdriver;

/**
 * Functional interface to get values
 *
 * @param <T> as general types.
 */
public interface StrategyGetter<T> {
  /**
   * Performs step and return generic value.
   *
   * @return generic type.
   */
  T performStep();
}
