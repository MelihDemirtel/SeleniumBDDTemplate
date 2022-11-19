package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class HomePage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait webDriverWait;

    static By searchInputlabel = By.xpath("//input[@type='text']");
    static By gorsellerButton = By.xpath("//a[text()='Görseller']");

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void homePage() {
    }

    public static void writeAraba(){
        elementHelper.sendKey(searchInputlabel,"araba");
    }

    public static void clickEnter(){
        elementHelper.sendEnter(searchInputlabel);
    }

    public static void clickGorseller(){
        elementHelper.click(gorsellerButton);
    }
}
