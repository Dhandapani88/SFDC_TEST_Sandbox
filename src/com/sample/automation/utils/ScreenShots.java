package com.sample.automation.utils;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.lang.RandomStringUtils;

public class ScreenShots {

	public void captureScreen() throws Exception 
	{     //int i = 0;
		
		String ext="png";
		File dir=new File("D:\\images"); 
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  
		Rectangle screenRectangle = new Rectangle(screenSize);   
		Robot robot = new Robot();   
		BufferedImage image = robot.createScreenCapture(screenRectangle); 
		String name = String.format("%s.%s", RandomStringUtils.randomAlphanumeric(8), ext);
        ImageIO.write(image, "png", new File(dir,name)); 
		
	} 
}
