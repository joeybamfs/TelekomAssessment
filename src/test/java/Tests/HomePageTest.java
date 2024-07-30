package Tests;

import com.saucedemo.Pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest{

    @Test
    public void homePageTest(){
        HomePage home = HomePage.homePage();

        //Access the Popups Page
        home.goToHome();

    }
}
