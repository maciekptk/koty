import Pages.ChangeMailPage;
import Pages.TempMailPage;
import Pages.Week9Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class MainTest {
    WebDriver driver;
    Week9Page week9Page;
    TempMailPage tempMailPage;
    ChangeMailPage changeMailPage;

    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        week9Page = new Week9Page(driver);
        tempMailPage = new TempMailPage(driver);
        changeMailPage = new ChangeMailPage(driver);

    }

//    @AfterMethod
//    public void after(){
//        driver.close();
//    }
}
