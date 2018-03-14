package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Week9Page extends MainPage {

//    @FindBy(css = "[data-week='9'] [data-id='30531fc0-d741-45cf-af9c-b650611473f4'] [title='Zagłosuj']")
//    private WebElement shilaVote;

    @FindBy(css = "[data-week='9'] [data-id='30531fc0-d741-45cf-af9c-b650611473f4'] div div a:first-child")
    private WebElement shilaVote;

    @FindBy(css = "[id='_evh-ric-c']")
    private WebElement cookiesCloseButton;



    public Week9Page(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public Week9Page openWeek9Page(){
        driver.get("https://www.wszechkoty.pl/galeria/9");
        //waitForJStoLoad();
        return this;
    }

//    public Week9Page clickCookiesCloseButton(){
//        cookiesCloseButton.click();
//        return this;
//    }

//    public Week9Page wait25second(){
//        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//        return this;
//    }

    public VotePage clickVoteButton(){
        shilaVote.click();
        return new VotePage(driver);
    }

    public Week9Page scrollToShila(){
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);",shilaVote);
        return this;
    }

    public Week9Page scrollByUp(){
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("scrollBy(0,-150)");
        return this;
    }




}
