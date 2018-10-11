package pages;

//import helper.ScreenshotHelper;
//import org.apache.log4j.Logger;
//import org.junit.Assert;
//import org.junit.rules.Timeout;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.Cookie;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import ru.yandex.qatools.allure.annotations.Attachment;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by irina on 08/10/2018.
 */
public class PageObject {

//
//		private static final long waitForTimeoutInSeconds = 7;
//		protected WebDriver driver;
//		protected Logger logger = Logger.getLogger(PageObject.class.getName());
//		private Random random = new Random();
//		private ScreenshotHelper screenShotHelper;
//
//		public PageObject(WebDriver driver) {
//			this.driver = driver;
//			PageFactory.initElements(driver, this);
//			screenShotHelper = new ScreenshotHelper(driver);
//		}
//
//		public WebDriver getDriver() {
//			return driver;
//		}
//
//		public void waitCondition(ExpectedCondition<?> condition) {
//			new WebDriverWait(getDriver(), TimeUnit.SECONDS.toMillis(30)).until(condition);
//		}
//
//
//
//
//		public void waitTimeOut(long timeout) {
//			waitTimeOut(timeout / 1000, TimeUnit.SECONDS);
//		}
//
//		public void waitTimeOut(long timeout, TimeUnit timeUnit) {
//			try {
//				if (timeUnit.toSeconds(timeout) >= 1) {
//					logger.info("Waiting " + timeout + " " + timeUnit.name().toLowerCase() + "...");
//				}
//				timeUnit.sleep(timeout);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//
//		public void saveStepScreenshot() {
//			screenShotHelper.saveStepScreenshot();
//		}
//
//		@SuppressWarnings("unchecked")
//		public Cookie getSessionCookie() {
//			String js = "return document.cookie.split(';')";
//			List<String> cookies = (List<String>) ((JavascriptExecutor) getDriver()).executeScript(js);
//			for (String cookie : cookies) {
//				cookie = cookie.trim();
//				if (cookie.startsWith("SID")) {
//					Pattern cookieParser = Pattern.compile("(\\w+)=(\\w+)");
//					Matcher matcher = cookieParser.matcher(cookie);
//					if (matcher.find())
//						return new Cookie(matcher.group(1), matcher.group(2));
//				}
//			}
//			Assert.assertTrue("No SID cookie found:\n" + cookies,
//					cookies.toString().startsWith("SID"));
//			return null;
//		}
//
//		public void executeJS(String js){
//			((JavascriptExecutor) getDriver()).executeScript(js);
//		}
//
//		@Attachment(value = "{0}", type = "text/html")
//		private String saveHtml(@SuppressWarnings("unused") String url, String html) {
//			return html;
//		}
//
//		public Alert getAlert() {
//			return new WebDriverWait(driver, 10L).until(ExpectedConditions.alertIsPresent());
//		}
//
//		public boolean alertIsPresent() {
//			return getAlert() != null;
//		}
	}



