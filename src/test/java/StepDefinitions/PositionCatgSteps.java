package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class PositionCatgSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to Position Categories")
    public void navigateToPositionCategories(DataTable elemets) {
        List<String> listElement = elemets.asList(String.class);

        for (String strButton : listElement){
            ln.findAndClick(strButton);

        }
    }

    @And("Click on the element in the Position Categories")
    public void clickOnTheElementInThePositionCategories(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (String strButton : listElement) {
            dc.findAndClick(strButton);
        }
    }

    @And("User sending the key in Position Categories")
    public void userSendingTheKeyInPositionCategories(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndCountainsText("successMessage", "success");
    }


}
