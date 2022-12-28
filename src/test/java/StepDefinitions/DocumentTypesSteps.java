package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class DocumentTypesSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @When("Navigate to Document Types")
    public void navigateToDocumentTypes(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement){
            ln.findAndClick(strButton);
        }
    }

    @And("Send keys in the Document Types")
    public void sendKeysInTheDocumentTypes(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Click on the elements in the Document Types")
    public void clickOnTheElements(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement) {
            dc.findAndClick(strButton);
        }
    }

    @And("switch to Save button")
    public void switchToSaveButton() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

    }

}
