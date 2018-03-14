package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RefreshPage extends MainPage {

    @FindBy(css = ".title-subject")
    private WebElement findEmail;

    public RefreshPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public EmailPage openEmail(){
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(findEmail));
        findEmail.click();
        waitForJStoLoad();
        return new EmailPage(driver);
    }




}

