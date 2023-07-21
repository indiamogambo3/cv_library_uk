package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {

    @DataProvider(name = "Job search")
    public Object [][] getData() {
        Object[][] data = new Object[][] {
                {"Tester", "Harrow, Greater London", "5 miles", "30000", "50000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow"},
                {"Developer", "Manchester", "7 miles", "40000", "80000", "Per annum", "Contract", "Contract Developer jobs in Manchester"},
                {"QA", "London", "2 miles", "3000", "5000", "Per month", "Permanent", "Permanent Qa jobs in London"},
                {"Software Tester", "Edgware, Greater London", "7 miles", "400", "1000", "Per day", "Permanent", "Permanent Software Tester jobs in Edgware"},
                {"Developer","London", "5 miles", "60000", "100000", "Per annum", "Temporary", "Temporary Developer jobs in London"},
                {"software tester", "Hendon, Greater London", "5 miles", "40000", "60000", "Per annum", "Permanent", "Permanent Software Tester jobs in Hendon"}
        };
        return data;
    }


}
