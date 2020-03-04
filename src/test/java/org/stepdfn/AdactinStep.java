package org.stepdfn;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStep extends Baseclass {

	@Given("user in adactin home page")
	public void user_in_adactin_home_page() {
		browserLaunch();
		LoadUrl("https://adactin.com/HotelApp/");
		max();

	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String uname, String pass) {
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		fill(name, uname);
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		fill(pwd, pass);
		WebElement btn = driver.findElement(By.xpath("//input[@type='Submit']"));
		click(btn);

	}

	@When("user fill  the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_fill_the(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {

		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		click(location);
		Select(location, s1);
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		click(hotel);
		Select(hotel, s2);
		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		click(roomtype);
		Select(roomtype, s3);
		WebElement Numroom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		click(Numroom);
		Select(Numroom, s4);
		WebElement cin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		fill(cin, s5);
		WebElement cout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		fill(cout, s6);
		WebElement adult = driver.findElement(By.id("adult_room"));
		click(adult);
		Select(adult, s7);
		WebElement child = driver.findElement(By.id("child_room"));
		click(child);
		Select(child, s8);
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		click(submit);

	}

	@When("user enter the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_the(String S1, String S2, String S3, String S4, String S5, String S6, String S7, String S8)
			throws InterruptedException {
		WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		click(radio);
		WebElement ctne = driver.findElement(By.id("continue"));
		click(ctne);

		WebElement fn = driver.findElement(By.xpath("//input[@name='first_name']"));
		fill(fn, S1);

		WebElement ln = driver.findElement(By.xpath("//input[@name='last_name']"));
		fill(ln, S2);

		WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
		fill(add, S3);

		WebElement crdnum = driver.findElement(By.xpath("//input[@name='cc_num']"));
		fill(crdnum, S4);

		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select(cctype, S5);

		WebElement mon = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select(mon, S6);

		WebElement yr = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select(yr, S7);
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		fill(cvv, S8);
		WebElement Bnow = driver.findElement(By.id("book_now"));
		click(Bnow);
		Thread.sleep(5000);
		WebElement orderno = driver.findElement(By.xpath("//input[@name='order_no']"));
		Att(orderno);
		screenst();

	}

	@Then("user get the order number")
	public void user_get_the_order_number() {
		currentURL();
	}
}
