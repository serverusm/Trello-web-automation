package com.qaacademy.module5.automation.trello.ui.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
      glue = "com.qaacademy.module5.automation.trello.ui",
      features = "src/test/resources/features/"
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
