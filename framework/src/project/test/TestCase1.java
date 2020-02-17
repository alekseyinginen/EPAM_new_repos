package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;
import project.pageObject.WhenAreYouGoingPage;

public class TestCase1 extends Base {

    @Test
    public void testCase1() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.form.isDisplayed(), "Main page did not opened");
        mainPage.location.sendKeys("oiyritytr");
        mainPage.date.click();
        mainPage.setStartDay(25);
        mainPage.setEndDay(12);
        mainPage.search.click();

        WhenAreYouGoingPage whenAreYouGoingPage = new WhenAreYouGoingPage();
        Assert.assertTrue(whenAreYouGoingPage.panel.isDisplayed(), "WhenAreYouGoingPage did not opened");
    }
}
