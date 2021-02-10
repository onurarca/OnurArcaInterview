package weightScale.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage_Numbers {


    public FirstPage_Numbers(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "coin_0")
    public WebElement coin_0;

    @FindBy(id = "coin_1")
    public WebElement coin_1;

    @FindBy(id = "coin_2")
    public WebElement coin_2;

    @FindBy(id = "coin_3")
    public WebElement coin_3;

    @FindBy(id = "coin_4")
    public WebElement coin_4;

    @FindBy(id = "coin_5")
    public WebElement coin_5;

    @FindBy(id = "coin_6")
    public WebElement coin_6;

    @FindBy(id = "coin_7")
    public WebElement coin_7;

    @FindBy(id = "coin_8")
    public WebElement coin_8;

    @FindBy(xpath = "//button[.='Reset']")
    public WebElement resetButton;

    @FindBy(id = "weigh")
    public WebElement weighButton;

    @FindBy(xpath = "//div[@class='game-info']//li[last()]")
    public WebElement testResult;


}
