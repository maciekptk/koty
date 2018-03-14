package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class IndexPage extends MainPage {

    @FindBy(css = "[id='active-email-success-modal'] .close")
    private List<WebElement> confirmationCloseButtonDisplayed;

    @FindBy(css = "[id='active-email-success-modal'] .close")
    private WebElement confirmationCloseButton;

    @FindBy(css = "[href='/galeria/9']")
    private WebElement goTo9PageButton;

    public IndexPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public IndexPage waitForConfirmation() {
        if (confirmationCloseButtonDisplayed.size() == 0) {
            WebDriverWait wait = new WebDriverWait(driver, 40);
            wait.until(ExpectedConditions.visibilityOf(goTo9PageButton));
            goTo9PageButton.click();
        } else {
            confirmationCloseButton.click();
        }
        return this;
    }

    public void closeTabs(){
        String myWindowHandle = driver.getWindowHandle();
        driver.close();
        driver.switchTo().window(myWindowHandle);
        driver.close();
    }
}
