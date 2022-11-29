package gestionaleLavanderia.magistralThesis;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class SeleniumTest {

	static String browser;
	static String projectPath = "C:\\Users\\User\\Desktop\\Repository GitHub\\gestionaleLavanderia\\magistralThesis\\src\\test\\java\\gestionaleLavanderia\\magistralThesis";
	static String pathToMacDrivers;
	static String address;
	static WebDriver driver;
	public String baseUrl = "http://localhost:4200/";
	
	@BeforeEach
	public void setUp() throws Exception {
		projectPath = System.getProperty("user.dir");
		if (System.getProperty("os.name").equals("Mac OS X")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/mac/chromedriver");
			address = "http://localhost:8080/spm2021";
			ChromeOptions chromeOptions = new ChromeOptions();
			driver = new ChromeDriver(chromeOptions);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} else {
			if (System.getProperty("os.name").contains("Windows")) {
				System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");
				address = "http://localhost:4200/";
				ChromeOptions chromeOptions = new ChromeOptions();
				driver = new ChromeDriver(chromeOptions);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} else {
				String userHomePath = System.getProperty("user.home");
				System.setProperty("webdriver.gecko.driver", userHomePath + "/Progetti/SPM2021-SSU/geckodriver");
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		}
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("Test works fine!");
		driver.quit();
	}

    @Test
	@Order(1)
	public void testMyAppTitle() {
		driver.navigate().to(baseUrl);
		System.out.println("Title is: " + driver.getTitle());
		assertTrue(driver.getTitle().contains("GestionaleLavanderia"));
	}

	@Test
	@Order(2)
	public void createClient() throws InterruptedException {
		driver.navigate().to(baseUrl + "add-user");
		// first take each button inside the list
		// i find the textfield with the id and i write inside username and password
		WebElement inputUsername = driver.findElement(By.id("name"));
		// i write inside textfield username
		inputUsername.sendKeys("Leonardo");
		WebElement inputSurname = driver.findElement(By.id("surname"));
		// i write inside textfield surname
		inputSurname.sendKeys("Mogianesi");
		WebElement inputAddress = driver.findElement(By.id("address"));
		// i write inside textfield address
		inputAddress.sendKeys("Via metauro 89C");
		WebElement inputPhone = driver.findElement(By.id("phone_number"));
		// i write inside textfield phone_number
		inputPhone.sendKeys("366364721");
		WebElement inputEmail = driver.findElement(By.id("email"));
		// i write inside textfield email
		inputEmail.sendKeys("leonardo.mogianesi@gmail.com");
		WebElement inputCryptoAddr = driver.findElement(By.id("wallet_address"));
		// i write inside textfield wallet address
		inputCryptoAddr.sendKeys("0x3742c46379C93fFAFc038C4a3feD6ba852ea08A8");
		WebElement inputGender = driver.findElement(By.id("maschio"));
		// i click inside radio gender male
		inputGender.click();
		WebElement submitButton = driver.findElement(By.id("submit_button"));
		// i click inside submit button
		submitButton.click();
		Thread.sleep(2000);
		String actualUrl = baseUrl + "find-user";
		String expectedUrl = driver.getCurrentUrl();
		// the router goes to /find-user
		Assert.assertEquals(expectedUrl, actualUrl);
	}
}