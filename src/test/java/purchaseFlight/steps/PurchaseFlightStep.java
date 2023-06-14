package purchaseFlight.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import purchaseFlight.util.*;
import purchaseFlight.pages.purchase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchaseFlightStep {

	purchase purchase;

	@Given("User navigates to purchase Page {string}")
	public void userNavigatesToPurchasePage(String url) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Thread.sleep(2000);
		purchase = new purchase();
	}

	@When("User enter Name {string}")
	public void userEnterName(String name) {

		purchase.enterName(name);

	}

	@When("User enters Address {string}")
	public void userEntersAddress(String Address) {
		purchase.enterAddress(Address);

	}

	@When("User enters City {string}")
	public void userEntersCity(String city) {
		purchase.enterCity(city);

	}

	@When("User etners State {string}")
	public void userEtnersState(String state) {
		purchase.enterState(state);

	}

	@When("User etners ZipCode {string}")
	public void userEtnersZipCode(String zipCode) {

		purchase.enterZipCode(zipCode);

	}

	@When("User selects Card Type {string}")
	public void userSelectsCardType(String cardType) {

		purchase.selectCardType(cardType);

	}

	@When("User etners Card Number {string}")
	public void userEtnersCardNumber(String cardNumber) {

		purchase.enterCreditCardNumber(cardNumber);

	}

	@When("User etners Month {string}")
	public void userEtnersMonth(String month) {

		purchase.enterMonth(month);
	}

	@When("User etners Year {string}")
	public void useretnersYear(String year) {

		purchase.enterYear(year);
	}

	@When("User etners Name On Card {string}")
	public void userEtnersNameOnCard(String nameOnCard) {

		purchase.enterNameOnCard(nameOnCard);

	}

	@When("User Checks remember me")
	public void userChecksRememberMe() {
		purchase.checkRememberMeBox();

	}

	@When("User Clicks Purchase Flight")
	public void userClicksPurchaseFlight() {

		purchase.clickPurchaseFlight();
	}

	@Then("User verifies success message {string}")
	public void userVerifiesSuccessMessage(String message) {

		purchase.verifyConfirmationMsg(message);

	}
}