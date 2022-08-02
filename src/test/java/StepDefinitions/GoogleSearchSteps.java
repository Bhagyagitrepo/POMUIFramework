package StepDefinitions;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver =null;
	
	@Given("browser is open on device")
	public void browser_is_open_on_device() throws InterruptedException {
	    System.out.println("inside step- browser is open ");
	   //System.setProperty("webdriver.chrome.driver", "C:/Users/Bhagyashri/eclipse-workspace/QA/src/test/resources/drivers/chromedriver.exe");
	    
	    String projectPath=System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver= new ChromeDriver();
	    // in case of slow network and objects loads slowly
	    //driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);depricated
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
       // driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	   // driver.get("www.google.com");
	    driver.manage().window().maximize();
	    //Thread.sleep(500);
	    //driver.close();
	    
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		 System.out.println("inside step-user is on google search page");
		 driver.navigate().to("https://google.com");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("user enters a text in serach box")
	public void user_enters_a_text_in_serach_box() {
		 System.out.println("inside the step -user enters a text in serach box");
		 driver.findElement(By.name("q")).sendKeys("udemy automation");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 
	}

	@When("hits enter")
	public void hits_enter() {
		 System.out.println("insidethe step-hitsenter");
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   	}

	@Then("user is navigated to the search results")
	public void user_is_navigated_to_the_search_results() {
		 System.out.println("inside step-user is navigated to the search results");  
		 driver.getPageSource().contains("Top Automation Courses Online");
		 driver.close();
		 driver.quit();
	}

}
