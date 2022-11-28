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
}