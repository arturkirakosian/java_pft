package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
     init();
  }

  private void init() {
    app.getGroupHelper().driver = new FirefoxDriver();
    app.baseUrl = "http://localhost/addressbook";
    app.getGroupHelper().driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    app.getGroupHelper().driver.get("http://localhost/addressbook/group.php");
    app.login("admin", "secret");
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    stop();
  }

  private void stop() {
    app.getGroupHelper().driver.quit();
    String verificationErrorString = app.verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}
