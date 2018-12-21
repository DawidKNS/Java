import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium
{
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dawid\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://accounts.google.com/signin/v2/sl/pwd?hl=pl&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[1]")).sendKeys("dawid.kondracki91@gmail.com");
        System.out.println("Poprawne logowanie");
        driver.quit();
    }
}
