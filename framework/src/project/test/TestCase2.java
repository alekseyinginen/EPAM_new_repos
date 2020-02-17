package project.test;

import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;

public class TestCase2 extends Base {


    @Test
    public void testCase2() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.form.isDisplayed(), "Main page did not opened");
        mainPage.location.sendKeys("oiyritytr");
        mainPage.search.click();
        Assert.assertEquals(Browser.Alerts().getText(),"Укажите дату заезда в гостиницу!");
        Browser.Alerts().accept();
    }
}
