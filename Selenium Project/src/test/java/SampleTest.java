import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleTest {

    private WebDriver driver;

    @Before
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraj\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testGeeks() {
        driver.get("https://www.geeksforgeeks.org");
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
