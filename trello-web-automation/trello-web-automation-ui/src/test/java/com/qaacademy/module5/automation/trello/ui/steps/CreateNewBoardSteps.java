package com.qaacademy.module5.automation.trello.ui.steps;

import com.qaacademy.module5.automation.core.ui.portals.trello.pages.boards.CreateNewBoardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateNewBoardSteps {
  private final CreateNewBoardPage createNewBoardPage;

  public CreateNewBoardSteps(){
    createNewBoardPage = new CreateNewBoardPage();
  }

  @When("I click on \"Create_new_board\" button")
  public void clickOnCreateNewBoardButton() {
    createNewBoardPage.clickOnCreateNewBoardButton();
  }

  @And("I fill {string} on board title field")
  public void fillOnBoardTitleField(String boardTitle) {
    createNewBoardPage.fillOnBoardTitleField(boardTitle);
  }

  @And("I click on \"create\" button")
  public void clickOnCreateButton() {
    createNewBoardPage.clickOnCreateButton();
  }
}
