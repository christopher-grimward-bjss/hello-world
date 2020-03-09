package com.performance.test.performanceTesting.optionone;

public class GreetingNotFoundException extends Exception {
    private String language;

    public GreetingNotFoundException(String language, String message) {
        super(message);
        this.language = language;
    }
}
