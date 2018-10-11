import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
//import o

/**
 * Created by irina on 08/10/2018.
 */
public class KharkovVodokanalTest
//		extends BaseStory
{
	public static final String FIREFOX_DRIVER = "firefox";

	public static final String CHROME_DRIVER = "chrome";

	public static final String GOOGLE_PAGE_URL = "https://www.google.com.ua";

	public static final String BROWSER_PROPERTY = "browser";

	public static final String CHROME_DRIVER_NAME = "chromedriver_mac";

	public static final String WEBDRIVER_CHROME_SYSTEM_PROPERTY = "webdriver.chrome.driver";

	private static WebDriver driver;

	@BeforeClass
	public static void setupClass() {
		if (FIREFOX_DRIVER.equals(System.getProperty(BROWSER_PROPERTY))) {
			driver = new FirefoxDriver();
		} else if (CHROME_DRIVER.equals(System.getProperty(BROWSER_PROPERTY))) {

			File file = new File(ClassLoader.getSystemClassLoader().getResource(CHROME_DRIVER_NAME).getFile());

			System.setProperty(WEBDRIVER_CHROME_SYSTEM_PROPERTY, file.getAbsolutePath());
			driver = new ChromeDriver();
			driver.get("http://vodokanal.kharkov.ua/");
			driver.get("http://google.com");
		}
	}

//	@Before
//	public void setupTest() {
//		driver = new ChromeDriver();
//	}

	@After
	public void teardown() {
		if(driver != null) {
			driver.quit();
		}
	}

	@Test
	public void printVodokanalDataAboutRepair() {
//		driver.navigate().to("http://vodokanal.kharkov.ua/");
//		kharkovVodokanalPageSteps.clickOnNewsLink();
		System.out.print("! "+ClassLoader.getSystemClassLoader());
		Assert.assertTrue(true);
	}
}
