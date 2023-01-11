package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginModuleClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver();
		WebDriverManager.firefoxdriver();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		
		driver.findElement(By.id("session_key")).sendKeys("amirhamza@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.className("sign-in-form__submit-button")).click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
