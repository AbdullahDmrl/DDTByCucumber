package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_CountryFunctionalityDatatableSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    FormContent fc=new FormContent();

    @And("^Click on the elements in the left nav$")
    public void clickOnTheElementsInTheLeftNav(DataTable elements) {
     List<String> listElements=elements.asList(String.class);
        for (String element : listElements){
            ln.findAndClick(element);
        }
    }

    @And("^Click on the elements in the dialog content$")
    public void clickOnTheElementsInTheDialogContent(DataTable elements) {
        List<String> listElements=elements.asList(String.class);
        for (String element : listElements){
            dc.findAndClick(element);
        }

    }

    @When("^User sending the keys in dialog content$")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElements=elements.asLists(String.class);

        for (List<String> listElement : listElements) {
            dc.findAndSend(listElement.get(0), listElement.get(1));
        }
    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed()  {
        dc.findAndContainsText("successMessage","successfully");
        dc.invisibilityOfElement("successMessage");
    }

}
