package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1Test {
	@Test
	public void m1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
	}

}
