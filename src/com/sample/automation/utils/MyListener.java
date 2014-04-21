package com.sample.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class MyListener extends AbstractWebDriverEventListener {
public void afterNavigateBack(WebDriver driver) {
System.out.println("Hello");
try {
Thread.sleep(5000L);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}