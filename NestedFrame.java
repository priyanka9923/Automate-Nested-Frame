package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NestedFrame {
    ChromeDriver driver;
    public NestedFrame()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
    //nested Frames

    public void testCase07() throws InterruptedException{
        // 1. Launch Browser (Chrome) :ChromeDriver()

        // 1.2 Maximize Window :driver.windows().manage().maximize();
        // 1.5 Handle Sync issue using implicitlyWait() :driver.windows().timeouts().implicitlyWait(30,TimeUnit.SECONDS)
        // 2. Load URL  https://the-internet.herokuapp.com/nested_frames
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        // 3. wait for 10 second  
        Thread.sleep(1000);
        // 5. switch to left frame  Using Locator "Name" driver.switchTo().frame("frame-top")
        driver.switchTo().frame("frame-top");
        //5. switch to left frame  Using Locator "Name" driver.switchTo().frame("frame-left")
        driver.switchTo().frame("frame-left");
        // 6.print the text Using Locator "Tag Name" driver.findElementByTagName('body').getText()
        System.out.println(driver.findElementByTagName("body").getText());

        // 7.switch to parent frame  driver. switchTo().parentFrame()
        driver.switchTo().parentFrame();
        // 5. switch to middleframe  Using Locator "Name" driver.switchTo().frame("frame-middle")
        driver.switchTo().frame("frame-middle");
        // 6.print the text Using Locator "Tag Name" driver.findElementByTagName('body').getText()
        System.out.println(driver.findElementByTagName("body").getText());

        // 7.switch to parent frame  driver. switchTo().parentFrame()
        driver.switchTo().parentFrame();
        // 5. switch to right frame  Using Locator ""Name"" driver.switchTo().frame("frame-right")
        driver.switchTo().frame("frame-right");
        // 6.print the text Using Locator "Tag Name" driver.findElementByTagName('body').getText()
        System.out.println(driver.findElementByTagName("body").getText());
        // 7.switch to parent frame  driver. switchTo().parentFrame()
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

        // 5. switch to bottom frame  Using Locator "Name" driver.switchTo().frame("frame-bottom")
        driver.switchTo().frame("frame-bottom");
        // 6.print the text Using Locator "Tag Name" driver.findElementByTagName('body').getText()
        System.out.println(driver.findElementByTagName("body").getText());

        // 7.switch to parent frame  driver. switchTo().parentFrame()
        driver.switchTo().parentFrame();
        
    }
}
