package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeMailPage extends MainPage {



    @FindBy(css = "[name='mail']")
    private WebElement mailInput;

    @FindBy(css = "[type='submit']")
    private WebElement submitButton;

    @FindBy(css = ".yourmail [id='mail']")
    private WebElement newMail;

    @FindBy(css = "[id='click-to-refresh']")
    private WebElement refreshButton;

    public ChangeMailPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ChangeMailPage enterMailAddress(String username){
        mailInput.sendKeys(username);
        return this;
    }

    public ChangeMailPage clickSubmitButton(){
        submitButton.click();
        return this;
    }

    public RefreshPage clickRefreshButton(){
        refreshButton.click();
        return new RefreshPage(driver);
    }


}
