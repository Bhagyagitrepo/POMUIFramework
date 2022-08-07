package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps  {
	
	 WebDriver driver =null;
	    
	 @Given("user is on login page")
	 public void user_is_on_login_page() throws InterruptedException{
		
		System.out.println("User inside login page");
	    String projectPath=System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	   
	    driver= new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();
        driver.navigate().to("https://gmail.com");
        driver.findElement(By.xpath(".//*[@type='email']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

	 
	 @When("user enters the username {string}")
	 public void user_enters_the_username(String username) {
		 driver.findElement(By.id("identifierId")).sendKeys(username);
		 //driver.findElement(By.id("password")).sendKeys(password);
	    
	 }
	 @When("click on the usenamenext button")
	 public void click_on_the_usenamenext_button() {
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).click();
			driver.findElement(By.id("identifierNext")).click();
		}
	
		
	 @When("user enters password {string}")
	 public void user_enters_password( String password) {
		 driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
		 //driver.findElement(By.id("password")).sendKeys(password);
	    
	 }

	@When("click on the passnext button")
	public void click_on_the_passnext_button() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.xpath(".//*[@id='passwordNext']/div/button/span")).click();
		driver.findElement(By.id("passwordNext")).click();
	}
	
	
	@Then("user navigated to home page")
	public void user_navigated_to_home_page() throws InterruptedException {
		System.out.println("User navigates to Home page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath(".//*[@id=\":1e\"]"));
	}

}
