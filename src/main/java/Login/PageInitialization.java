package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
public class PageInitialization {
    public WebDriver driver;
    public SingnUp singnUp;


    public PageInitialization(WebDriver driver) {
        this.driver = driver;
        singnUp = initElements(new SingnUp(this));
    }

    /**
     * Метод инициализирующий страницы (block)
     *
     * @param block
     */
    private <T extends Base> T initElements(T block) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), block);

        return block;
    }

    /**
     * @return the driver
     */
    public WebDriver getWebDriver() {
        return driver;
    }
    public void singnUp(){
        singnUp.singnUp();
    }

}
