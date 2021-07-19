package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SignUpSteps {

	public static WebDriver driver;

	@Given("user is on PHPTravels HomePage")
	public void user_is_on_PHPTravels_HomePage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/home");
		String title = driver.getTitle();
		Assert.assertEquals(title, "PHPTRAVELS | Travel Technology Partner");

	}

	@When("user clicks My Account")
	public void user_clicks_My_Account() {
		driver.findElement(By.xpath("(//*[@id='dropdownCurrency'])[2]")).click();

	}

	@When("user select Sign Up")
	public void user_select_Sign_Up() {
		driver.findElement(By.linkText("Sign Up")).click();
	}

	@When("user enters the personal details")
	public void user_enters_the_personal_details(io.cucumber.datatable.DataTable data) {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Register");
		List<String> formData = data.asList();
		driver.findElement(By.name("firstname")).sendKeys(formData.get(0));
		driver.findElement(By.name("lastname")).sendKeys(formData.get(1));
		driver.findElement(By.name("phone")).sendKeys(formData.get(2));
		driver.findElement(By.name("email")).sendKeys(formData.get(3));
		driver.findElement(By.name("password")).sendKeys(formData.get(4));
		driver.findElement(By.name("confirmpassword")).sendKeys(formData.get(5));

		String fname = driver.findElement(By.name("firstname")).getAttribute("value");
		String lname = driver.findElement(By.name("lastname")).getAttribute("value");
		String phone = driver.findElement(By.name("phone")).getAttribute("value");
		String email = driver.findElement(By.name("email")).getAttribute("value");
		String pwd = driver.findElement(By.name("password")).getAttribute("value");
		String confirmPwd = driver.findElement(By.name("confirmpassword")).getAttribute("value");
		
		Assert.assertEquals(fname,formData.get(0));
		Assert.assertEquals(lname,formData.get(1));
		Assert.assertEquals(phone,formData.get(2));
		Assert.assertEquals(email,formData.get(3));
		Assert.assertEquals(pwd,formData.get(4));
		Assert.assertEquals(confirmPwd,formData.get(5));
		

	}

	@Then("user clicks Sign Up button")
	public void user_clicks_Sign_Up_button() {
		WebElement signUpBtn = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", signUpBtn);
		signUpBtn.click();
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}
}
