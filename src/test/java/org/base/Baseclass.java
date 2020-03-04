package org.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;

	public static void max() {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

	public static void browserLaunch() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"D:\\eclipse-workspace\\AdactinBase\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("browser is not lanched");
		}
	}

	public static void LoadUrl(String Value) {
		driver.get(Value);
	}

	public static void fill(WebElement ele, String Value) {
		ele.sendKeys(Value);
	}

	public static void click(WebElement ele) {
		ele.click();
	}

	public static void quitBrowser() {
		driver.close();
	}

	public static void Select(WebElement ele, String value)

	{
		Select SH = new Select(ele);
		SH.selectByVisibleText(value);
	}

	public static void Att(WebElement ele) {
		String data = ele.getAttribute("value");
		System.out.println(data);
	}

	public static void screenst() {

		File so = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\task scrn shot\\screenshotsauto\\" + timestamp() + ".png");

		try {
			FileUtils.copyFile(so, dest);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

	public static void currentURL() {
		String url = driver.getCurrentUrl();
		boolean b = url.contains("BookingConfirm");
		Assert.assertTrue("Verify the url", b);
		System.out.println(b);

	}

}
