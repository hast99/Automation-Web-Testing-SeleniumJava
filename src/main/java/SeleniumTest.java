import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

    @Test
    public void test() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        System.out.println(driver.findElement(By.xpath("//h2")).getText());
        // input form name=username
        driver.findElement(By.name("username")).sendKeys("student");
        // input form name=password
        driver.findElement(By.name("password")).sendKeys("Password123");
        // click button id=submit
        driver.findElement(By.id("submit")).click();
        // getText() 'Logged In Successfully'
        System.out.println(driver.findElement(By.xpath("//h1")).getText());
        // click button logout
        driver.findElement(By.xpath("//div//div//a[contains(text(), 'Log out')]")).click();
        driver.quit();
    }
}
