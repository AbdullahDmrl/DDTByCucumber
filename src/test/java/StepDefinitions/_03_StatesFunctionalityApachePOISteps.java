package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.ExcelUtility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _03_StatesFunctionalityApachePOISteps {
    DialogContent dc = new DialogContent();
    LeftNav ln=new LeftNav();

    @And("^Navigate to states page and chose the country$")
    public void navigateToStatesPageAndChoseTheCountry() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("staTes");
        dc.findAndClick("statesCountry");
        dc.listWebelementsSelect("countryAllOptions","Germany");
    }


    @When("^User Create states with ApachePOI$")
    public void userCreateACitizenshipWithApachePOI() {
        List<List<String>> Liste= ExcelUtility.getlistData("src/test/java/Excel/resources/StatesGermany.xlsx",
                "Sheet1",2);

        for (int i = 0; i < Liste.size(); i++) {
            dc.findAndClick("addButton");
            dc.findAndSend("nameInput", Liste.get(i).get(0));
            dc.findAndSend("shortName", Liste.get(i).get(1));
            dc.findAndClick("saveButton");
            dc.findAndContainsText("successMessage","success");
            dc.invisibilityOfElement("successMessage");


        }

    }

    @When("^User Delete states with ApachePOI$")
    public void userDeleteACitizenshipWithApachePOI() {
        List<List<String>> Liste= ExcelUtility.getlistData("src/test/java/Excel/resources/StatesGermany.xlsx",
                "Sheet1",2);

        for (int i = 0; i < Liste.size(); i++) {

            dc.findAndDelete(Liste.get(i).get(0));
            dc.findAndContainsText("successMessage","success");
            dc.invisibilityOfElement("successMessage");
        }





    }


}
