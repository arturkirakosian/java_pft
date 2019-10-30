package ru.deliveryClub;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTests {

  @Test
  public void firstTests() {
    System.setProperty("webdriver.chrome.driver", "/Users/AKirakosyan/Downloads/chromedriver2.exe");
    ChromeDriver driver = new ChromeDriver();

    driver.get("https://www.delivery-club.ru");
  }
}
