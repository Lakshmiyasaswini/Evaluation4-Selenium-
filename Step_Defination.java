package Defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Defination {
	WebDriver driver;

@Given("User on the Naaptol Homepage")
public void user_on_the_naaptol_homepage() {
	driver = new ChromeDriver();
	driver.get("https://www.naaptol.com/");
	driver.manage().window().maximize();
    
}

@When("Navigate to the Home and Kitchen section")
public void navigate_to_the_home_and_kitchen_section() {
   
}

@Then("User should see the Home and Kitchen title")
public void user_should_see_the_home_and_kitchen_title() {
    
}



}
