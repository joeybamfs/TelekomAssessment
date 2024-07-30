package com.saucedemo.Utilies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag {
    WebDriver driver;

    Actions actions;
    public Drag(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }


    public void dragByOffset(WebElement element, int x){
        actions.dragAndDropBy(element, x, 0).perform();
    }
}
