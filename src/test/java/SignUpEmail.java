import Login.SingnUp;
import Login.TestBase;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class SignUpEmail{
    WebDriver driver;
    protected SingnUp singnUp;


    @Before
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        ((RemoteWebDriver) driver).setLogLevel(Level.FINEST);
        driver.manage().window().maximize();
        singnUp = new SingnUp(driver);

    }

        @Test
        public void SignUpViaEmail(){
            singnUp = new SingnUp(driver);
            singnUp.singnUp();
            singnUp.fillUpFullname();
            singnUp.emailAddress();
            singnUp.password();
            singnUp.submit();
        }
    }

