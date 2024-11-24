package com.StepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SignIn {
	WebDriver driver;
	JavascriptExecutor js;
	String fName;

	@Given("Open {string}")
	public void open(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(url);

		js = (JavascriptExecutor) driver;
	}

	@When("Click on Create Account link")
	public void click_on_create_account_link() {
		driver.findElement(By.linkText("Create an Account")).click();
	}

	@When("Enter first Name as {string}")
	public void enter_first_name_as(String firstName) {
		fName = firstName;
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstName);
	}

	@When("Enter last name as {string}")
	public void enter_last_name_as(String lastName) {
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastName);
	}

	@When("Enter emailid as {string}")
	public void enter_emailid_as(String emailId) {
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys(emailId);
	}

	@When("Enter Password as {string}")
	public void enter_password_as(String password) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	}

	@When("Enter Confirm Password as {string}")
	public void enter_confirm_password_as(String cPassword) {
		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys(cPassword);
	}

	@When("Click on Create a Account button")
	public void click_on_create_a_account_button() throws InterruptedException {
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, 400)", "");

		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
		Thread.sleep(5000);
	}

	@Then("Account should created")
	public void account_should_created() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span")).getText().contains(fName));
	}
}
