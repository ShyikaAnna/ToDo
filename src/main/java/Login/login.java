package Login;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class login extends TestBase {
    @Test
    public void login() {
        driver.navigate().to("https://todo.vu");
        driver.findElement(By.xpath("//*[@id=\"et-secondary-nav\"]/li[1]/a")).click();
        wait.until(titleIs("Log in - todo.vu"));
        driver.findElement(By.id("input-username")).sendKeys("a.shiyka@redwerk.com");
        driver.findElement(By.id("input-password")).sendKeys("foxtrot4");
        driver.findElement(By.name("form.button.submit")).click();
    }
}
