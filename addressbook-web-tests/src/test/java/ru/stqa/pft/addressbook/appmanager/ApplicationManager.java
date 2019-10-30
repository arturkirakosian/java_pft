package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;

public class ApplicationManager {
  private final GroupHelper groupHelper = new GroupHelper();
  public String baseUrl;
  public StringBuffer verificationErrors = new StringBuffer();
  private boolean acceptNextAlert = true;

  public void login(String username, String password) {
    groupHelper.driver.findElement(By.name("user")).clear();
    groupHelper.driver.findElement(By.name("user")).sendKeys(username);
    groupHelper.driver.findElement(By.name("pass")).clear();
    groupHelper.driver.findElement(By.name("pass")).sendKeys(password);
    groupHelper.driver.findElement(By.id("LoginForm")).submit();
  }

  public void gotoGroupPage() {
    groupHelper.driver.findElement(By.linkText("groups")).click();
  }

  private boolean isElementPresent(By by) {
    try {
      groupHelper.driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      groupHelper.driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = groupHelper.driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }
}
