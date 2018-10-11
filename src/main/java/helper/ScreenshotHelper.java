//package helper;
//
////import org.apache.commons.io.output.ByteArrayOutputStream;
////import org.apache.log4j.Logger;
//import org.apache.tika.io.IOUtils;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import ru.yandex.qatools.allure.annotations.Attachment;
//
//import javax.imageio.ImageIO;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//
///**
// * Created by irina on 08/10/2018.
// */
public class ScreenshotHelper {
//
////		protected Logger logger = Logger.getLogger(this.getClass());
//		private WebDriver driver;
//
//		public ScreenshotHelper(WebDriver driver) {
//			this.driver = driver;
//		}
//
//		@Attachment(value = "Step screenshot", type = "image/png")
//		public byte[] saveStepScreenshot() {
//			return takeScreenshot();
//		}
//
//		@Attachment(value = "Failure screenshot", type = "image/png")
//		public byte[] failureScreen() {
//			return takeScreenshot();
//		}
//
//
//		@Attachment(value = "Configuration failure screenshot", type = "image/png")
//		public byte[] configurationFailureScreen() {
//			return takeScreenshot();
//		}
//
//		@SuppressWarnings("unchecked")
//		public byte[] makeFullScreenshot(WebDriver driver) throws IOException, InterruptedException {
//			scrollVerticallyTo(driver, 0);
//			try (ByteArrayInputStream inputStream = new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES))) {
//				BufferedImage image = ImageIO.read(inputStream);
//				closeInputSteam(inputStream);
//				int capturedWidth = image.getWidth();
//				int capturedHeight = image.getHeight();
//				long longScrollHeight = ((Long) ((JavascriptExecutor) driver).executeScript("return Math.max(document.body.scrollHeight, document.documentElement.scrollHeight,document.body.offsetHeight, document.documentElement.offsetHeight,document.body.clientHeight, document.documentElement.clientHeight);"));
//				Double devicePixelRatio = ((Number) ((JavascriptExecutor) driver).executeScript("window.devicePixelRatio = window.devicePixelRatio || window.screen.deviceXDPI / window.screen.logicalXDPI; var pr = window.devicePixelRatio; if (pr != undefined && pr != null) return pr; else return 1.0;")).doubleValue();
//				int scrollHeight = (int) longScrollHeight;
//				int adaptedCapturedHeight = (int) ((double) capturedHeight / devicePixelRatio);
//				BufferedImage resultingImage;
//				if (Math.abs(adaptedCapturedHeight - scrollHeight) > 40) {
//					int times = scrollHeight / adaptedCapturedHeight;
//					int leftover = scrollHeight % adaptedCapturedHeight;
//					BufferedImage tiledImage = new BufferedImage(capturedWidth, (int) ((double) scrollHeight * devicePixelRatio), 1);
//					Graphics2D g2dTile = tiledImage.createGraphics();
//					g2dTile.drawImage(image, 0, 0, null);
//					int scroll = 0;
//
//					BufferedImage lastPart;
//					for (int nextImage = 0; nextImage < times - 1; ++nextImage) {
//						scroll += adaptedCapturedHeight;
//						scrollVerticallyTo(driver, scroll);
//						try (ByteArrayInputStream inputStream2 = new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES))) {
//							lastPart = ImageIO.read(inputStream2);
//							closeInputSteam(inputStream);
//							g2dTile.drawImage(lastPart, 0, (nextImage + 1) * capturedHeight, null);
//						}
//					}
//
//					if (leftover > 0) {
//						scroll += adaptedCapturedHeight;
//						scrollVerticallyTo(driver, scroll);
//						try (ByteArrayInputStream inputStream3 = new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES))) {
//							BufferedImage var21 = ImageIO.read(inputStream3);
//							lastPart = var21.getSubimage(0, var21.getHeight() - (int) ((double) leftover * devicePixelRatio), var21.getWidth(), leftover);
//							g2dTile.drawImage(lastPart, 0, times * capturedHeight, null);
//						}
//					}
//
//					scrollVerticallyTo(driver, 0);
//					resultingImage = tiledImage;
//				} else {
//					resultingImage = image;
//				}
//				try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
//					ImageIO.write(resultingImage, "png", baos);
//					baos.flush();
//					byte[] bytes = baos.toByteArray();
//					baos.reset();
//					IOUtils.closeQuietly(baos);
//					return bytes;
//				}
//			}
//		}
//
//		protected void closeInputSteam(ByteArrayInputStream inputStream) throws IOException {
//			inputStream.reset();
//			IOUtils.closeQuietly(inputStream);
//			inputStream.close();
//		}
//
//		public void scrollVerticallyTo(WebDriver driver, int scroll) {
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, " + scroll + ");");
//			try {
//				waitUntilItIsScrolledToPosition(driver, scroll);
//			} catch (InterruptedException var3) {
////				logger.info("Interrupt error during scrolling occurred. " + var3);
//			}
//
//		}
//
//		private void waitUntilItIsScrolledToPosition(WebDriver driver, int scrollPosition) throws InterruptedException {
//			int time = 250;
//			for (boolean isScrolledToPosition = false; time >= 0 && !isScrolledToPosition; isScrolledToPosition = Math.abs(obtainVerticalScrollPosition(driver) - scrollPosition) < 3) {
//				Thread.sleep(50L);
//				time -= 50;
//			}
//
//		}
//
//		public byte[] takeScreenshot() {
//			byte[] screenshot = null;
//
//			RemoteWebDriver remote = (RemoteWebDriver) driver;
//			try {
//				screenshot = makeFullScreenshot(remote);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			if (screenshot == null) try {
//				screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			} catch (Exception e) {
////				logger.error("Couldn't take screenshot\n" + e.getMessage());
//				return new byte[]{};
//			}
//
//			return screenshot;
//		}
//
//		private static int obtainVerticalScrollPosition(WebDriver driver) {
//			Long scrollLong = (Long) ((JavascriptExecutor) driver).executeScript("return (window.pageYOffset !== undefined) ? window.pageYOffset : (document.documentElement || document.body.parentNode || document.body).scrollTop;");
//			return scrollLong.intValue();
//		}
	}

