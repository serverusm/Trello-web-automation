package com.qaacademy.module5.automation.core.utils;

import java.nio.file.InvalidPathException;

public class PathNotFoundException extends InvalidPathException {
    public PathNotFoundException(String input, String reason) {
        super(input, reason);
    }
}
