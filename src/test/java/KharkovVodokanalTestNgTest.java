

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

///**
// * Created by irina on 08/10/2018.
// */
public class KharkovVodokanalTestNgTest {
	public static final String FIREFOX_DRIVER = "firefox";

	public static final String CHROME_DRIVER = "chrome";

	public static final String BROWSER_PROPERTY = "browser";

	public static final String CHROME_DRIVER_NAME = "chromedriver_mac";

	public static final String WEBDRIVER_CHROME_SYSTEM_PROPERTY = "webdriver.chrome.driver";

	private WebDriver driver = null;

	@BeforeClass
	public void setupClass() {
		if (FIREFOX_DRIVER.equals(System.getProperty(BROWSER_PROPERTY))) {
			driver = new FirefoxDriver();
		} else if (CHROME_DRIVER.equals(System.getProperty(BROWSER_PROPERTY))) {
			File resourcesDirectory = new File("selenium/"+CHROME_DRIVER_NAME);
			System.setProperty(WEBDRIVER_CHROME_SYSTEM_PROPERTY, resourcesDirectory.getAbsolutePath());
			driver = new ChromeDriver();
		}
	}

	@Test
	public void printVodokanalDataAboutRepair() {
		driver.get("http://vodokanal.kharkov.ua/");
		Assert.assertEquals(driver.getTitle(),"Новости - КП «Харьковводоканал»");
	}

	@AfterMethod
	public void teardown() {
		if(driver != null) {
			driver.quit();
		}
	}


}
