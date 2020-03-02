package com.mv.GetsPlacements1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	
	public void checkCondition(WebDriver driver)
	{
   
	 for(int i=0; i<3; i++)  { 
			
		
		 WebDriverWait wait;
			
		 try {
		 By container = By.id("dvQuesContainer"); 
		 
		 wait = new WebDriverWait(driver,7);
		 //System.out.println("call2");
			
		 wait.until(ExpectedConditions.presenceOfElementLocated(container));
		 //System.out.println("call3");
			
		
			if(!driver.findElements(By.xpath("//*[@id='dvAudioImgPlayId']/img")).isEmpty())
			 {
				  WebDriverWait some_element = new WebDriverWait(driver,5); 
				  WebElement audio=some_element.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='dvAudioImgPlayId']/img")));
			             audio.click();
			             Thread.sleep(10000);
			 }
			else if(!driver.findElements(By.xpath("//*[@id='dvQuesContainer']/div[1]/div/div[1]/div")).isEmpty()) 
		{
			WebDriverWait some_element1 = new WebDriverWait(driver,5); 
			  WebElement video=some_element1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='dvQuesContainer']/div[1]/div/div[1]/div")));
		      video.click();
		      Thread.sleep(10000);
		}
			
			driver.findElement(By.xpath("//*[@id='dvQuestionOutter']/div[2]/div/input")).click();
		
	  
	 }
		
		
		catch(Exception ee) {

			System.out.println("exception"+ee);
			

		}		 
	
	 }
}
}
		 
	

	
	

