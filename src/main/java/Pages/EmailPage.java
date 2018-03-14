package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage extends MainPage {

    @FindBy(css = "[href^='https://www.wszechkoty.pl']")
    private WebElement emailLink;

    public EmailPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public IndexPage clickEmailLink(){
        emailLink.click();
        return new IndexPage(driver);
    }

    public EmailPage refreshPage(){
        driver.navigate().refresh();
        return this;
    }

    public void closeTab(){
        driver.close();
    }




}
