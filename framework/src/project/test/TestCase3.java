package project.test;

import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;

public class TestCase3 extends Base {

    @Test
    public void testCase3() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.form.isDisplayed(), "Main page did not opened");
        mainPage.date.click();
        mainPage.setStartDay(25);
        mainPage.setEndDay(12);
        mainPage.search.click();

        Assert.assertEquals(Browser.Alerts().getText(),"Укажите место поиска гостиницы!");
    }
}
