package practice;

import java.awt.Desktop.Action;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class zoomOut {
	public static AndroidDriver driver;


    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws MalformedURLException {
    	 DesiredCapabilities cap = new DesiredCapabilities();

         cap.setCapability("deviceName", "a6fuugukwcwseekv");
         cap.setCapability("platformName", "Android");
         cap.setCapability("appPackage", "com.android.chrome");
         cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
         URL url = new URL("http://127.0.0.1:4723/wd/hub");
         driver = new AndroidDriver(url, cap);

         System.out.println("Account verification");
     	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     	WebElement account = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]"));
     	account.click();
     	WebElement accountverify = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]"));
     	accountverify.click();
     	WebElement gotit = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"));
     	gotit.click();
     	System.out.println("Chrom browser lauched successfully");
     	
    	WebElement enterURL2=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
 		enterURL2.sendKeys("https://testautomationpractice.blogspot.com/");
 		WebElement clickURL = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
 		clickURL.click();
 		
    	
 		//ZoomOut script
 		WebElement ZoomOutElement=driver.findElement(AppiumBy.xpath("	\r\n"
 				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View"));

    	
 		  Map<String, Object> params = new HashMap<String, Object>();
 		    params.put("percent", 1.00);
 		    params.put("left",ZoomOutElement.getLocation().getX()+50);
 		    params.put("top",ZoomOutElement.getLocation().getY()-50);
 		    params.put("width",ZoomOutElement.getRect().getHeight()-50);
 		    params.put("height",ZoomOutElement.getRect().getWidth()-50);

 		    AndroidDriver js = driver;
 		    js.executeScript("mobile: pinchCloseGesture", params);
 		    
    }
    }
