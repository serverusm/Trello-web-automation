package com.qaacademy.module5.automation.core.ui.environment;

/**
 * Custom reserved words enum.
 */
enum ReservedWords {
  ENVIRONMENT_PATH("E:/AutomationWeb/Trello-web-automation/trello-web-automation/trello-core-ui-automation/src/test/resources/Environment.json");
  //E:/AutomationWeb/Trello-web-automation/trello-web-automation/trello-core-ui-automation/src\test/resources/Environment.json
  private final String word;

  /**
   * Initializes Reserved Words enum.
   *
   * @param word original word.
   */
  ReservedWords(final String word) {
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
