package com.saucedemo.Pages;

import org.openqa.selenium.WebDriver;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import static com.saucedemo.BaseUrl.BaseUrl.BASE;

public class HomePage {

    public static HomePage homePage() {
        return new HomePage();
    }

    public void goToHome() {
        open(BASE);
    }


}
