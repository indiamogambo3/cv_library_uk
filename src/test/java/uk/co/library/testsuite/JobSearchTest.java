package uk.co.library.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultsPage;
import uk.co.library.testbase.BaseTest;

@Listeners(CustomListeners.class)

public class JobSearchTest extends BaseTest {

    HomePage homePage;
    ResultsPage resultsPage;

    @BeforeMethod
    public void inIt() {

        homePage = new HomePage();
        resultsPage = new ResultsPage();
    }

    @Test(dataProvider = "Job search", dataProviderClass = TestData.class, groups = {"sanity", "regression"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) throws InterruptedException {


        homePage.acceptIFrameAlert();
        homePage.jobSearch(jobTitle, location, distance, salaryMin, salaryMax, salaryType, jobType, result);
        Assert.assertEquals(resultsPage.verifyTheResults(), result, "Unable to verify result.");
    }


}
