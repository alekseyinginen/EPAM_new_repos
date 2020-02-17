package project.pageObject;

import framework.elements.Input;
import framework.elements.Label;
import framework.elements.Button;
import framework.utils.LogUtils;
import org.openqa.selenium.By;

public class MainPage {
    public Label form = new Label(By.xpath("//div[contains(@class,'searchform border_radius_10')]"),"search form");
    public Input location = new Input(By.xpath("//input[@placeholder='Город, отель, аэропорт, вокзал, метро, точный адрес']"),"Location");
    public Button startDay;
    public Button endDay;
    public Button search = new Button(By.xpath("//input[@value='Найти гостиницу!']"),"search");
    public Button date = new Button(By.xpath("//div[@class='step step2 stepDates']//div[@class='dateDiv']//div//span[contains(@class,'dateText')]"),"date");
    public Button star5 = new Button(By.xpath("//input[@id='hc_f_filter_star_5']"),"star 5");

    public void setStartDay(int start){
        startDay = new Button(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'"+start+"')]"),"start day");
        startDay.click();
    }

    public void setEndDay(int end){
        endDay = new Button(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default'][contains(text(),'"+end+"')]"),"end day");
        endDay.click();
    }
}
