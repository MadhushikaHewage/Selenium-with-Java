package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public WebDriver driver;

	@Given("User navigate to the Welcome Page")
	public void user_navigate_to_the_welcome_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	}

	@Then("User navigate to the Authentication Page")
	public void user_navigate_to_the_authentication_page() {
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
	}

	@When("User enter the email address and password")
	public void user_enter_the_email_address_and_password() {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sof20b133@uovt.ac.lk");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("LUMA#2023");
	}

	@When("User click the SignIn button")
	public void user_click_the_sign_in_button() {
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
	}

	@Then("User navigate to the Cloths page")
	public void user_navigate_to_the_cloths_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/a/span/span[2]")).click();
	}

	@Then("User selects short in size and color")
	public void user_selects_short_in_size_and_color() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[4]/ol/li[1]/div/div/div[3]/div[1]/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[4]/ol/li[1]/div/div/div[3]/div[2]/div/div[3]")).click();
	}

	@Then("User clicks short Add to cart")
	public void user_clicks_short_add_to_cart() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[4]/ol/li[1]/div/div/div[4]/div/div[1]/form/button")).click();
	}

	@Then("User selects tee in size and color")
	public void user_selects_tee_in_size_and_color() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[4]/ol/li[8]/div/div/div[2]/div[1]/div/div[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[4]/ol/li[8]/div/div/div[2]/div[2]/div/div[3]")).click();
	}

	@Then("User clicks add to cart")
	public void user_clicks_add_to_cart() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[4]/ol/li[8]/div/div/div[3]/div/div[1]/form/button")).click();
	}

	@Then("User clicks cart button")
	public void user_clicks_cart_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
	}

	@Then("User clicks on Proceed to Checkout button")
	public void user_clicks_on_proceed_to_checkout_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[3]/div/button")).click();
	}

	@Then("User clicks Next button")
	public void user_clicks_next_button() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
	}

	@Then("User clicks Place Order button")
	public void user_clicks_place_order_button() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")).click();
	}

	@Then("User verifies the order")
	public void user_verifies_the_order() throws InterruptedException {
		Thread.sleep(4000);
		if (driver.getPageSource().contains("Thank you for your purchase!")) {
			System.out.println("Successfully Purchased!");
		} else {
			System.out.println("Failed to Purchased!");
		}
	}


}
