import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\FlywheelAutomation\\AutomationPractice\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.alibaba.com/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement categories = driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[1]/div/div/h3/i[2]"));
        Actions action = new Actions(driver);

        action.moveToElement(categories).perform();

        WebElement Shoes = driver.findElement(By.linkText("Shoes & Accessories"));
        action.moveToElement(Shoes).perform();

        WebElement shoeCare = driver.findElement(By.linkText("Shoe Care & Services"));
        action.moveToElement(shoeCare).perform();
        shoeCare.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("#left-category-nav > div > div:nth-child(2) > div.name > a")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement shoeBrush = driver.findElement(By.xpath("//*[@id=\"page-path\"]/div/h1"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        if (shoeBrush.isDisplayed()) {
            System.out.println("Element is Visible");
        } else {
            System.out.println("Element is InVisible");
        }
        System.out.println("passed");

        driver.close();
        driver.quit();
    }
}
