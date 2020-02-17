package project.pageObject;

import framework.elements.Button;
import framework.elements.Input;
import framework.elements.Label;
import org.openqa.selenium.By;

public class WhenAreYouGoingPage {
    public Label panel = new Label(By.xpath("//h1[contains(text(),'Куда вы едете?')]"),"panel");
    }
