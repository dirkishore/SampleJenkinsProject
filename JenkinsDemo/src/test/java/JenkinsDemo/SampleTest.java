package JenkinsDemo;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleTest {
	@Test
	public void Test() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C://Users//kishore//Downloads//edgedriver_win64//msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
