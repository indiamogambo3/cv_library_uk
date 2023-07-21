package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class ResultsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;


    public String verifyTheResults() {
        Reporter.log("Verify the result text" + resultText.toString());
        CustomListeners.test.log(Status.PASS, "Verify the result text");
        return getTextFromElement(resultText);
    }

}
