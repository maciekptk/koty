package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TempMailPage extends MainPage {



    @FindBy(css = "[id='click-to-change']")
    private WebElement changeButton;

    public TempMailPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public TempMailPage openTempMail(){
        driver.get("https://temp-mail.org/pl/");
        return this;
    }

    public ChangeMailPage clickChangeButton(){
        changeButton.click();
        waitForJStoLoad();
        return new ChangeMailPage(driver);
    }


}
