import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Tolik on 7/12/2016.
 */
public class simpleWebDriverTest {
    @Test
    public void listCheesecakes() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.linkedin.com/");
        WebElement emailField = driver.findElement(By.linkText("Menu"));
        emailField.click();
        driver.findElement(By.linkText("Cheesecake")).click();
        driver.close();
        driver.

        }

    }

