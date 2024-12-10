package com.qaacademy.module5.automation.core.ui.portals.trello.pages.login;

public enum UserTypes {
  TRELLO_USER_PASSWORD("TRELLO-USER-PASSWORD");

  private final String word;

  /**
   * Initializes Reserved Words enum.
   *
   * @param word original word.
   */
  UserTypes(final String word) { this.word = word; }

  /**
   * Gets the enum word value
   *
   * @return original word
   */
  public String val() { return word; }
}
