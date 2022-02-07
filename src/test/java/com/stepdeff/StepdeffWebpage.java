package com.stepdeff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepdeffWebpage {
	WebDriver driver;
	@Given("user is on main page")
	public void user_is_on_main_page() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
	}

	@When("verify a firstname,lastname and date {string},{string},{string}")
	public void verify_a_firstname_lastname_and_date(String string1, String string2, String string3) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.name("firstname"));
		element.sendKeys(string1);
		WebElement lstname = driver.findElement(By.name("lastname"));
		lstname.sendKeys(string2);
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys(string3);
		
		
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("verify the full pages");
	}


}
