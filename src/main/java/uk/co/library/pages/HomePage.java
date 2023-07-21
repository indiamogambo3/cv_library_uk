package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[@class='mat-button-wrapper']//span[text()='Accept All']")
    WebElement acceptCookie;
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement searchJobTitle;
    @CacheLookup
    @FindBy(id = "location")
    WebElement searchLocation;
    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;
    @FindBy(id = "gdpr-consent-notice")
    WebElement getInToIFrame;
    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllBtn;


    public void acceptAllCookies() {
        Reporter.log("Mouse hover and accept cookies" + acceptCookie.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover and accept cookies");
        mouseHoverToElementAndClick(acceptCookie);

    }

    public void enterJobTitle(String jobTitle) {
        Reporter.log("Enter job title" + jobTitle + "to job title field" + searchJobTitle.toString());
        CustomListeners.test.log(Status.PASS, "Enter job title" + jobTitle);
        sendTextToElement(searchJobTitle, jobTitle);
    }

    public void enterLocation(String location) {
        Reporter.log("Enter location" + location + "to location field" + searchLocation.toString());
        CustomListeners.test.log(Status.PASS, "Enter location" + location);
        sendTextToElement(searchLocation, location);
    }

    public void selectDistance(String distance) {
        Reporter.log("Select distance" + distance + "to location field" + distanceDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select distance" + distance);
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }

    public void clickOnMoreSearchOptionLink() {
        Reporter.log("Click on more search option link" + moreSearchOptionsLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on more search option link");
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter minimum salary" + minSalary + "to location field" + salaryMin.toString());
        CustomListeners.test.log(Status.PASS, "Enter minimum salary" + minSalary);
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter maximum salary" + maxSalary + "to location field" + salaryMax.toString());
        CustomListeners.test.log(Status.PASS, "Enter maximum salary" + maxSalary);
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String sType) {
        Reporter.log("Select salary type" + sType + "to location field" + salaryTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select salary type" + sType);
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
    }

    public void selectJobType(String jobType) {
        Reporter.log("Select job type" + jobType + "to location field" + jobTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select job type" + jobType);
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }

    public void clickOnFindJobsButton() {
        Reporter.log("Click on find jobs button" + findJobsBtn.toString());
        CustomListeners.test.log(Status.PASS, "Click on find jobs button");
        clickOnElement(findJobsBtn);
    }

    public void acceptIFrameAlert() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().frame(getInToIFrame);
        clickOnElement(acceptAllBtn);
        driver.switchTo().defaultContent();
        //log.info("Accepting cookies: " + acceptAllBtn.toString());
    }

    public void jobSearch(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                          String result) {


        enterJobTitle(jobTitle);
        enterLocation(location);
        selectDistance(distance);
        clickOnMoreSearchOptionLink();
        enterMinSalary(salaryMin);
        enterMaxSalary(salaryMax);
        selectSalaryType(salaryType);
        selectJobType(jobType);
        clickOnFindJobsButton();
    }
}
