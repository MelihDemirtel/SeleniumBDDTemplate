package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import util.DriverFactory;

public class HomePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);

    @Given("user is on home page")
    public void userIsOnHomePage() {
        HomePage.homePage();
    }

    @When("user write araba on search label")
    public void userWriteArabaOnSearchLabel() {
        HomePage.writeAraba();
    }

    @When("user click enter on keyboard")
    public void userClickEnterOnKeyboard() {
        HomePage.clickEnter();
    }

    @When("user click gorseller")
    public void userClickGorseller() {
        HomePage.clickGorseller();
    }
}
