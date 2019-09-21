package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonTest {
    public static WebDriver wd = null;

    @BeforeClass
    public void checkIfWeCanLogInToAmazon() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\samia\\Facebook\\src\\main\\java\\driver\\chromedriver.exe ");
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get("https://amazon.com");
    }

    @AfterClass
    public void cleanUp() {
        wd.close();
    }

    @Test
    public void InputUserAndPass() {
        wd.findElement(By.id("a-autoid-0-announce")).click();
        wd.findElement(By.id("ap_email")).sendKeys("samianrahman@aol.com");
        wd.findElement(By.cssSelector("input[type='submit']")).click();
        wd.findElement(By.id("ap_password")).sendKeys("*****");
        wd.findElement(By.cssSelector("input[id = 'signInSubmit']")).click();
    }


            }







