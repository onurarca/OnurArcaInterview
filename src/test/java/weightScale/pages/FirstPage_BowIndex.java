package weightScale.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage_BowIndex {

    public FirstPage_BowIndex(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "left_0")
    public WebElement leftBox1;

    @FindBy(id = "left_1")
    public WebElement leftBox2;

    @FindBy(id = "left_2")
    public WebElement leftBox3;

    @FindBy(id = "left_3")
    public WebElement leftBox4;

    @FindBy(id = "left_4")
    public WebElement leftBox5;

    @FindBy(id = "5")
    public WebElement leftBox6;

    @FindBy(id = "left_6")
    public WebElement leftBox7;

    @FindBy(id = "left_7")
    public WebElement leftBox8;

    @FindBy(id = "left_8")
    public WebElement leftBox9;

    //************************//

    @FindBy(id = "right_0")
    public WebElement rightBox1;

    @FindBy(id = "right_1")
    public WebElement rightBox2;

    @FindBy(id = "right_2")
    public WebElement rightBox3;

    @FindBy(id = "right_3")
    public WebElement rightBox4;

    @FindBy(id = "right_4")
    public WebElement rightBox5;

    @FindBy(id = "right_5")
    public WebElement rightBox6;

    @FindBy(id = "right_6")
    public WebElement rightBox7;

    @FindBy(id = "right_7")
    public WebElement rightBox8;

    @FindBy(id = "right_8")
    public WebElement rightBox9;

}
