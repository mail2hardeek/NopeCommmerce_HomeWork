package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2"; // creating string variable to store the website link
        WebDriver driver = new ChromeDriver(); //responsible to open the Chrome browser
        driver.get(baseUrl);
        System.out.println("Tittle: " + driver.getTitle()); //Print tittle
        System.out.println("Current URL : " + driver.getCurrentUrl()); //Print Current URL
        System.out.println("Page source: " + driver.getPageSource()); //Print Page Source

        WebElement email = driver.findElement(By.id("Email")); //declared variable for email
        email.sendKeys("mail2hardeek@yahoo.com"); //to send the command to print the email address in the email address field
        WebElement password = driver.findElement(By.id("Password")); // declared variable for password
        password.sendKeys("Omsairam"); //to send the command to print the password in the password field
        driver.close(); //Close the Browser
    }

}
