package weightScale.tests;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import weightScale.TestBase;
import weightScale.pages.FirstPage_BowIndex;
import weightScale.pages.FirstPage_Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ScaleTest extends TestBase {

    FirstPage_BowIndex firstPage_bowIndex;
    FirstPage_Numbers firstPage_numbers;
    List<String> numbers;
    List<WebElement> elements;
    Actions actions;
    Alert alert;

    {
        String log4jConfPath = "log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);

    }

    private final Logger LOG = LogManager.getLogger(ScaleTest.class);


    @Before
    public void setup() {
        getDriver();
        firstPage_bowIndex = new FirstPage_BowIndex(driver);
        firstPage_numbers = new FirstPage_Numbers(driver);
        actions = new Actions(driver);

    }

    @When("user navigates to the website")
    public void user_navigates_to_the_website() {
        LOG.info("User navigates to application website.");

        driver.get("http://ec2-54-208-152-154.compute-1.amazonaws.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Then("weights all bars one by one")
    public void weights_all_bars_one_by_one() {
        LOG.info("User starts to weight the golden bars.");
        elements = new ArrayList<>();

        elements.add(firstPage_numbers.coin_0);
        elements.add(firstPage_numbers.coin_1);
        elements.add(firstPage_numbers.coin_2);
        elements.add(firstPage_numbers.coin_3);
        elements.add(firstPage_numbers.coin_4);
        elements.add(firstPage_numbers.coin_5);
        elements.add(firstPage_numbers.coin_6);
        elements.add(firstPage_numbers.coin_7);
        elements.add(firstPage_numbers.coin_8);


        numbers = new ArrayList<>();
        numbers.add(firstPage_numbers.coin_0.getText());
        numbers.add(firstPage_numbers.coin_1.getText());
        numbers.add(firstPage_numbers.coin_2.getText());
        numbers.add(firstPage_numbers.coin_3.getText());
        numbers.add(firstPage_numbers.coin_4.getText());
        numbers.add(firstPage_numbers.coin_5.getText());
        numbers.add(firstPage_numbers.coin_6.getText());
        numbers.add(firstPage_numbers.coin_7.getText());
        numbers.add(firstPage_numbers.coin_8.getText());
    }

    @Then("finds the lighter bar.")
    public void finds_the_lighter_bar() {
        LOG.info("User finds the lightest golden bar.");
        for (int i = 0, b = 1; b < numbers.size(); i++, b++) {

            firstPage_bowIndex.leftBox1.sendKeys(numbers.get(i));
            firstPage_bowIndex.rightBox1.sendKeys(numbers.get(b));
            firstPage_numbers.weighButton.click();
            if (firstPage_numbers.testResult.getText().contains(">")) {
                assertTest(b);
                break;

            } else if (firstPage_numbers.testResult.getText().contains("<")) {
                assertTest(i);
                break;
            } else {
                actions.click(firstPage_numbers.resetButton).perform();

            }


        }
    }

    @Then("closes the browser.")
    public void closes_the_browser() {
        LOG.info("Browser closes in 10 seconds.");
        waitXSeconds(10);
        driver.quit();


    }


    public void assertTest(int indexNum) {
        LOG.info("Gold Bar number " + numbers.get(indexNum) + " weighs lighter.");
        actions.click(elements.get(indexNum)).perform();
        alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("You find it!"));

    }


}
