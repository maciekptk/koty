import org.testng.annotations.Test;

public class VoteTest extends MainTest {

//    String usernameTemplate = "testowy";
//    int usernameNumber = 42;
//    String username = usernameTemplate + usernameNumber;
//    String email = username + "@carbtc.net";

    @Test
    public void shouldVote() {
        for (int usernameNumber = 116; usernameNumber <= 130; usernameNumber++) {

            String usernameTemplate = "testowy";
            String username = usernameTemplate + usernameNumber;
            String email = username + "@carbtc.net";

            week9Page.openWeek9Page()
                    .scrollToShila()
                    .scrollByUp()
                    .clickVoteButton()
                    .inputEmail(email)
                    .clickSubmitButton()
                    .waitForCloseButton()
                    .clickCloseButton() //dziala
                    .openTempMail()
                    .clickChangeButton()
                    .enterMailAddress(username)
                    .clickSubmitButton()
                    .clickRefreshButton()
                    .openEmail()
                    .clickEmailLink()
                    .closeTabs();
        }
    }
}


//    public void shouldCheckEmail(){
//        tempMailPage.openTempMail()
//                .clickChangeButton()
//                .enterMailAddress(username)
//                .clickSubmitButton()
//                .clickRefreshButton()
//                .openEmail()
//                .clickEmailLink();
//
//
//    }
//}
