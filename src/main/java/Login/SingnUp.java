package Login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SingnUp extends TestBase{
    private String singUpForm = "/html/body/div[1]/div/div[1]/div[2]/form/div[2]";
    private String fullname = "mui-id-0";
    @Test
    public void singnUp() {
        driver.navigate().to("https://todo.vu");
        driver.findElement(By.linkText("SIGN UP")).click();
        By lsingUpForm = By.xpath(singUpForm);
        WebElement form = driver.findElement(lsingUpForm);
        wait.until(ExpectedConditions.visibilityOf(form));
    }
    public void fillUpFullname(){
        By lfullname = By.id(fullname);
        driver.findElement(lfullname).sendKeys("Gregory Alvarez");
    }
}
