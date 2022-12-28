package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class BankAccounts_GradeLevelsSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the element in left nav")
    public void clickOnTheElementInLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement) {
            ln.findAndClick(strButton);
        }
    }


    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (String strButton : listElement) {
            dc.findAndClick(strButton);

        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("User search before edit item from Dialog content")
    public void userSearchBeforeEditItemFromDialogContent(DataTable elements) {
        List<List<String>> listElement= elements.asLists(String.class);

        for(int i=0;i< listElement.size() ; i++ )
            dc.findAndSearch(listElement.get(i).get(0), listElement.get(i).get(1) );
    }

    @And("User edit item from Dialog content")
    public void userEditItemFromDialogContent(DataTable elements) {
        List<List<String>> listElement= elements.asLists(String.class);

        for(int i=0;i< listElement.size() ; i++ )
            dc.findAndEdit(listElement.get(i).get(0), listElement.get(i).get(1) );
    }

    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String>listElement=elements.asList(String.class);

        for(String strButton:listElement){
            dc.findAndDelete(strButton);

        }

    }


    @And("Click on the tab in the Dialog")
    public void clickOnTheTabInTheDialog() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);


    }

    @And("User delete item from Dialog without search")
    public void userDeleteItemFromDialogWithoutSearch(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for(String strButton:listElement){
            dc.findAndClick(strButton);}
    }


}
