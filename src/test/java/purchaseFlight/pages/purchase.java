package purchaseFlight.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import purchaseFlight.util.Constants;

public class purchase {

	@FindBy(id = "inputName")
	WebElement nameField;

	@FindBy(id = "address")
	WebElement addressField;

	@FindBy(id = "city")
	WebElement cityField;

	@FindBy(id = "state")
	WebElement stateField;

	@FindBy(id = "zipCode")
	WebElement zipCodeField;

	@FindBy(id = "cardType")
	WebElement cardTypeField;

	@FindBy(id = "creditCardNumber")
	WebElement creditCardNumberField;

	@FindBy(id = "creditCardMonth")
	WebElement monthField;

	@FindBy(id = "creditCardYear")
	WebElement yearField;

	@FindBy(id = "nameOnCard")
	WebElement nameOnCardField;

	@FindBy(id = "rememberMe")
	WebElement rememberMeCheckBox;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement purchaseFlightButton;

	@FindBy(xpath = "//h1[text()='Thank you for your purchase today!']")
	WebElement ConfirmationMessage;

	public purchase() {

		PageFactory.initElements(Constants.driver, this);

	}

	public void enterName(String name) {

		nameField.sendKeys(name);
	}

	public void enterAddress(String address) {

		addressField.sendKeys(address);
	}

	public void enterCity(String city) {

		cityField.sendKeys(city);
	}

	public void enterState(String state) {

		stateField.sendKeys(state);
	}

	public void enterZipCode(String zipCode) {

		zipCodeField.sendKeys(zipCode);
	}

	public void selectCardType(String cardType) {

		Select select = new Select(cardTypeField);
		select.selectByVisibleText(cardType);

	}

	public void enterCreditCardNumber(String cardNumber) {

		creditCardNumberField.sendKeys(cardNumber);
	}

	public void enterMonth(String month) {

		monthField.sendKeys(month);
	}

	public void enterYear(String year) {

		yearField.sendKeys(year);
	}

	public void enterNameOnCard(String nameOnCard) {

		nameOnCardField.sendKeys(nameOnCard);
	}

	public void checkRememberMeBox() {

		rememberMeCheckBox.click();
	}

	public void clickPurchaseFlight() {

		purchaseFlightButton.click();
	}

	public void verifyConfirmationMsg(String expMessage) {

		String actMsg = ConfirmationMessage.getText();
		if (actMsg.equals(expMessage)) {
			System.out.println("Verification PASSED");

		} else {
			System.out.println("Verification FAILED");
		}

	}

}
