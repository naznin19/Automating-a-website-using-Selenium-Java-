		package automation.com;


		
		
		import static org.testng.Assert.assertEquals;

		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.Select;
		import org.openqa.selenium.support.ui.WebDriverWait;


		public class AutomationExercise {

		    public static void main(String[] args) throws InterruptedException {

		        // Set the path of the ChromeDriver executable file
		        System.setProperty("webdriver.chrome.driver", "C:\\eclipse_workspace\\QaAssessment\\Driver\\chromedriver.exe");

		        // Launch ChromeBrowser
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the URL
		        driver.get("https://automationexercise.com/");

		        // Verify that the homePage is visible
		        String expectedUrl = "https://automationexercise.com/";
		        String actualUrl = driver.getCurrentUrl();

		        if (actualUrl.equals(expectedUrl)) {
		            System.out.println("Homepage is visible successfully");
		        } else {
		            System.out.println("Homepage is not visible successfully");
		        }

		        //Click on View Product from Home Page
		        WebElement ViewProduct = driver.findElement(By.xpath("//ul[@class = 'nav nav-pills nav-justified']"));
		        ViewProduct.click();
		        Thread.sleep(2000);
		        
		        //Click on Add to cart from product details page
		        WebElement AddToCart = driver.findElement(By.xpath("//button[@class = 'btn btn-default cart']"));
		        AddToCart.click();
		        Thread.sleep(2000);
		        
		        //Click on View cart
		        WebElement ViewCart = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]"));
		        ViewCart.click();
		        Thread.sleep(2000);
		        
		        //Verify if Cart page is displayed
		        String expectedUrl1 = "https://automationexercise.com/view_cart";
		        String actualUrl1 = driver.getCurrentUrl();
		        
		        if(actualUrl1.equals(expectedUrl1)) {
		        	System.out.println("Cart page is visible successfully");
		        	
		        }
		        else {
		        	System.out.println("Cart page is not visible successfully");
		        }
		        
		        Thread.sleep(2000);
		        
		        //Click on Proceed to Checkout
		        WebElement ProceedtoCheckout = driver.findElement(By.xpath("//a[@class = 'btn btn-default check_out']"));
		        ProceedtoCheckout.click();
		        Thread.sleep(2000);
		        
		        //Click on Login/register button
		        WebElement LoginRegisterButton = driver.findElement(By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u"));
		        LoginRegisterButton.click();
		        Thread.sleep(2000);
		        
		        
		        //Signup Proceedure
		        WebElement Name = driver.findElement(By.xpath("//input[@type = 'text']"));
		        Name.sendKeys("Sabiha Naznin");
		        Thread.sleep(2000);
		        
		        WebElement EmailAddress = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		        EmailAddress.sendKeys("nsabiha567575S323@gmail.com");	
		        Thread.sleep(2000);
		        
		        //Click on Submit button
		        WebElement SubmitButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		        SubmitButton.click();
		        Thread.sleep(2000);
		        
		        //Fill up the sign up information
		        if(driver.getCurrentUrl().contains("/signup")) {
		        	
		        	WebElement CheckButton = driver.findElement(By.xpath("//input[@id = 'id_gender2']"));
		        	CheckButton.click();
		        	Thread.sleep(2000);
		        	
		        	WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		        	Password.sendKeys("0502084");
		        	
		        	
		        	//Select First name
		        	WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		        	FirstName.sendKeys("Sabiha");
		        	Thread.sleep(2000);
		        	
		        	//Select Last name
		        	WebElement LastName = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		        	LastName.sendKeys("Naznin");
		        	Thread.sleep(2000);
		        	
		        	//Select Address
		        	WebElement Address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		        	Address.sendKeys("Rampura");
		        	Thread.sleep(2000);
		        	
		        	//Select Country from the DropDown
		        	WebElement CDropDown = driver.findElement(By.xpath("//select[@id ='country']"));
		        	Select select = new Select(CDropDown);
		        	select.selectByIndex(1);
		        	Thread.sleep(2000);
		        	
		        	
		        	//Select State
		        	WebElement State = driver.findElement(By.xpath("//*[@id=\"state\"]"));
		        	State.sendKeys("Iowa");
		        	Thread.sleep(2000);
		        	
		        	
		        	//Select City
		        	WebElement City = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		        	City.sendKeys("Iowa");
		        	Thread.sleep(2000);
		        	
		        	
		        	//Select ZipCode
		        	WebElement ZipCode = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
		        	ZipCode.sendKeys("1002");
		        	Thread.sleep(2000);
		        	
		        	
		        	//Select Mobile Number
		        	WebElement MobileNumber = driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
		        	MobileNumber.sendKeys("3434546");
		        	Thread.sleep(2000);
		        	
		        	//Click on Create Account Button
		        	WebElement CreateAccount = driver.findElement(By.xpath("//button[@type ='submit']"));
		        	CreateAccount.click();
		        	Thread.sleep(2000);
		        	
		        	WebElement ContinueButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
		        	ContinueButton.click();
		        	
		        	
		        	//Verify the logged in UserName
		        	WebElement loggedInUserName = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b"));
		        	String expectedUserName = "Sabiha Naznin";
		        	String actualUserName = loggedInUserName.getText();
		        	assertEquals(expectedUserName, actualUserName);
		        	
		        	
		        	
		        	//Click on cart button
		        	WebElement CartButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a"));
		        	CartButton.click();
		        	Thread.sleep(2000);
		        	
		        	//Click on Proceed to Checkout Button
		        	WebElement ProceedToCheckout1 = driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a"));
		        	ProceedToCheckout1.click();
		        	Thread.sleep(2000);
		        	
		        	WebElement TextArea = driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea"));
		        	TextArea.sendKeys("Test Data");
		        	
		        	WebElement PlaceOrder = driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a"));
		        	PlaceOrder.click();
		        	Thread.sleep(2000);
		        	
		        	
		        	//Fill up the information of Payment Page 
		        	WebElement NameonCard = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input"));
		        	NameonCard.sendKeys("sabiha naznin");
		        	Thread.sleep(2000);
		        	
		        	WebElement CardNumber = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input"));
		        	CardNumber.sendKeys("122323234");
		        	Thread.sleep(2000);
		        	
		        	WebElement CVC = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input"));
		        	CVC.sendKeys("123");
		        	Thread.sleep(2000);
		        	
		        	WebElement ExpiredMonth = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input"));
		        	ExpiredMonth.sendKeys("12");
		        	WebElement ExpiredYear = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input"));
		        	ExpiredYear.sendKeys("2030");
		        	Thread.sleep(2000);
		        	
		        	WebElement PayConfirmOrder = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		        	PayConfirmOrder.click();
		        	Thread.sleep(2000);
		        	
		        	
		        
		        	
		        	}
		        
		        

		        // Quit the driver
		        driver.quit();
		       
		        
		    }
		    
		}
		       
	