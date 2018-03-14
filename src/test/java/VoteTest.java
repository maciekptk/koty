import org.testng.annotations.Test;

public class VoteTest extends MainTest {


    @Test
    public void shouldVote() {
        for (int usernameNumber = 116; usernameNumber <= 130; usernameNumber++) {

            String usernameTemplate = "testowy";
            String username = usernameTemplate + usernameNumber;
            //String email = username + "@carbtc.net";
//            String email = changeMailPage.getNewEmail();


//            week9Page.openWeek9Page()
//                    .scrollToShila()
//                    .scrollByUp()
//                    .clickVoteButton()
//                    .inputEmail(email)
//                    .clickSubmitButton()
//                    .waitForCloseButton()
//                    .clickCloseButton() //dziala
//                    .openTempMail()
//                    .clickChangeButton()
//                    .enterMailAddress(username)
//                    .clickSubmitButton()
//                    .clickRefreshButton()
//                    .openEmail()
//                    .clickEmailLink()
//                    .closeTabs();
//        }
//    }

            tempMailPage.openTempMail()
                    .clickChangeButton()
                    .enterMailAddress(username)
                    .selectDomain()
                    .clickSubmitButton()
                    .openLandingPage()
                    .scrollToShila()
                    .scrollByUp()
                    .clickVoteButton()
                    .inputEmail()
                    .clickSubmitButton()
                    .waitForCloseButton()
                    .clickCloseButton();


//                    .clickRefreshButton()
//                    .openEmail()
//                    .clickEmailLink();
        }
    }
}
