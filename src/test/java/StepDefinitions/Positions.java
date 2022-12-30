package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class Positions {


    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();


    @And("Navigate to Positions Under HR  Setup")
    public void navigateToPositionsUnderHRSetup(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement) {
            ln.findAndClick(strButton);
        }
    }

    @And("Click on the element in the Positions")
    public void clickOnTheElementInThePositions(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement) {
            dc.findAndClick(strButton);
        }
    }

    @And("User sending the key in Positions")
    public void userSendingTheKeyInPositions(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }
}
