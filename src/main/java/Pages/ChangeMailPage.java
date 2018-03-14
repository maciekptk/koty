package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class ChangeMailPage extends MainPage {

    int min = 1;
    int max = 11;
    int diff = max - min;
    Random rn = new Random();
    int randomInt = rn.nextInt(diff + 1) + min;

    String cssSelector = ".form-control option:nth-child(" + randomInt +")";

    @FindBy(css = "[name='mail']")
    private WebElement mailInput;

    @FindBy(css = "[type='submit']")
    private WebElement submitButton;

//    @FindBy(css = ".yourmail [id='mail']")
//    private WebElement newMail;

    private String email;

    @FindBy(css = "[id='click-to-refresh']")
    private WebElement refreshButton;

    public ChangeMailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getEmail() {
        return email = driver.findElement(By.cssSelector(".yourmail [id='mail']")).getText();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ChangeMailPage enterMailAddress(String username){
        mailInput.sendKeys(username);
        return this;
    }

    public ChangeMailPage clickSubmitButton(){
        submitButton.click();
        return this;
    }

    public Week9Page openLandingPage(){
        driver.get("https://www.wszechkoty.pl/galeria/9");
        return new Week9Page(driver);
    }

//    public String getEmail() {
//        return email = driver.findElement(By.cssSelector(".yourmail [id='mail']")).getText();
//
//    }

    public ChangeMailPage selectDomain(){
        driver.findElement(By.cssSelector(cssSelector)).click();
        return this;
    }

    public RefreshPage clickRefreshButton(){
        refreshButton.click();
        return new RefreshPage(driver);
    }


}
