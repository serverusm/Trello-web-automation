package com.qaacademy.module5.automation.core.utils;

/**
 * Custom reserved words enum.
 */
public enum ReservedWords {
    DOUBLE_DOT_AND_SLASH("../"),
    STRING_EMPTY("");

    private final String word;

    /**
     * Initializes reserved Words enum.
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

    public String val(){
        return word;
    }
}
