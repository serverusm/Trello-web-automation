package com.qaacademy.module5.automation.trello.ui.steps;

import com.qaacademy.module5.automation.core.ui.portals.trello.pages.startAtlassian.StartAtlassianPage;
import io.cucumber.java.en.When;

public class StartAtlassianStep {
  @When("I click on \"Start Product Trello\" button on \"StartAtlassian\" page")
  public void clickOnStartProductTrelloButtonOnStartAtlassianPage() {
    StartAtlassianPage startAtlassianPage = new StartAtlassianPage();
    startAtlassianPage.clickOnStartProductTrelloButton();
  }
}
