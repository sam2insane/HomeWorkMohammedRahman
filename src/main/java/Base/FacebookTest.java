package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FacebookTest {
    public static WebDriver driver = null;
    @BeforeClass
    public void  setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\samia\\Facebook\\src\\main\\java\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //navigate to facebook

        driver.get("https://facebook.com");
    }
        @AfterClass
        public void cleanUp() {
            //close the driver
            driver.close();

        }

    @Test
    public void testUserCannotLogInWithInvalidCredentials() {
        // enter in an invalid email
        driver.findElement(By.id("email")).sendKeys("samianrahman@aol.com");
        driver.findElement(By.id("pass")).sendKeys("Aggdef");
        driver.findElement(By.cssSelector("input[value='Log In']")).click();



    }
}
