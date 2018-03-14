package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VotePage extends MainPage {

    @FindBy(css = "[id='emailactivationform-email']")
    private WebElement emailField;

    @FindBy(css = "[type='submit']")
    private WebElement submitButton;

    @FindBy(css = "[id='gallery-success-modal-sended'] .close")
    private WebElement closeButton;

    public VotePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public VotePage inputEmail(String email){
        emailField.sendKeys(email);
        return this;
    }

    public VotePage clickSubmitButton(){
        submitButton.click();
        return this;
    }

    public VotePage waitForCloseButton(){
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(closeButton));
        return this;
    }

    public TempMailPage clickCloseButton(){
        closeButton.click();
        return new TempMailPage(driver);
    }



}
