package booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		String testEmail = "user@gmail.com";
		String pass = "Pass34Word";
				
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		driver.manage().window().maximize(); 
		driver.findElement(By.xpath("//a[@class='bui-button bui-button--secondary js-header-login-link']//span[@class='bui-button__text'][normalize-space()='Register']")).click();
		driver.findElement(By.id("username")).sendKeys(testEmail);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("new_password")).sendKeys(pass);
		driver.findElement(By.name("confirmed_password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"FhNXDYJyxalxPuz\"]")).click();
	}

}
