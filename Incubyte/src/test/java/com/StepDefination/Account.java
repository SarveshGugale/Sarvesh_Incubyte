package com.StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Account {
	WebDriver driver;

	@Given("hit URL {string}")
	public void hit_url(String URL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
	}

	@When("Click on Sign In")

	public void click_on_sign_in1() {

		driver.findElement(By.linkText("Sign In")).click();

	}

	@When("Enter creating account Email Address {string}")

	public void enter_creating_account_email_address(String Email) {

		driver.findElement(By.id("email")).sendKeys(Email);

	}

	@When("Enter creating account Password {string}")

	public void enter_creating_account_password(String Password) {

		driver.findElement(By.id("pass")).sendKeys(Password);

	}

	@When("Click on SignIn")

	public void click_on_sign_in() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click()",
				driver.findElement(By.id("send2")));


		//driver.findElement(By.id("send2")).click();
	}

	@Then("Logged In successfully")

	public void logged_in_successfully() {

		System.out.println("logged_in_successfully");
	}

}
