import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestNGClass {
    WebDriver driver;

    @BeforeTest
    public  void prepare(){
        System.out.println("Let's open the browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        System.out.println("Closing browser");
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void openWebsite(){
        System.out.println("Open the website");
        driver.navigate().to("https://www.udemy.com");
    }
    @Test
    public void signUp(){
        System.out.println("Signing up");
    }

    @Test
    public void login(){
        System.out.println("Logging in");
    }

    @Test
    public void addToCart(){
        System.out.println("Adding item to cart");
    }

    @Test
    public void logOut(){
        System.out.println("Logging out");
    }



}
