package Login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SingnUp extends Base{
    public SingnUp(PageInitialization pageInitialization)
    {
        super(pageInitialization);
    }
    public SingnUp(WebDriver driver) {
        super(driver);
    }
    private String singUpForm = "/html/body/div[1]/div/div[1]/div[2]/form/div[2]";
    private String fullname = "mui-id-0";
    private String emailAddress = "mui-id-1";
    private String password = "mui-id-2";
    private String submit = "submit";

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
    public void emailAddress(){
        By lemailAddress = By.id(emailAddress);
        driver.findElement(lemailAddress).sendKeys("genius@web2mailco.com");
    }
    public void password(){
        By lpassword = By.id(password);
        driver.findElement(lpassword).sendKeys("foxtrot4");
    }
    public void submit(){
        By lsubmit = By.tagName(submit);
        driver.findElement(lsubmit).click();
    }
}

