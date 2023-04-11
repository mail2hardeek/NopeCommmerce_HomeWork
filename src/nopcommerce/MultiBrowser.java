package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiBrowser { // Class
    static String browser = "Chrome"; //
    static WebDriver driv;

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

    public static void main(String[] args) { // main method declared
        if (browser.equalsIgnoreCase("Chrome")) { // Conditions applied for which browser to open
            driv = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Safari")) { // Conditions applied for which browser to open

        } else if (browser.equalsIgnoreCase("Fire Fox")) { // Conditions applied for which browser to open

        } else if (browser.equalsIgnoreCase("Opera")) { // Conditions applied for which browser to open

        } else if (browser.equalsIgnoreCase("Edge")) { // Conditions applied for which browser to open

        } else {
            System.out.println("Browser not found"); // Print statement for out of list browser
        }
        driv.get(baseUrl); //Calling the url
        driv.manage().window().fullscreen(); // full screen to be open
        System.out.println("Tittle : " + driv.getTitle()); //Reason why we write sout to see the title in console
        System.out.println("Current URL : " + driv.getCurrentUrl()); // Requesting current URL
        System.out.println("Page Source : " + driv.getPageSource());
        WebElement login = driv.findElement(By.linkText("Log in")); // Clicking on the login button
        login.click(); // click on the button
        WebElement email = driv.findElement(By.id("Email")); // Email address request
        email.sendKeys("mail2hardeek@yahoo.com"); //
        WebElement password = driv.findElement(By.id("Password"));
        password.sendKeys("Omsairam");
        driv.close();

    }


}
