package vitoraugusto.core;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class SucessoEmail {
	
	@Test
	public void testeLogin() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "/Volumes/Secundario/Facebook/geckodriver");
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().setSize(new Dimension(1200, 1200));
	  driver.get("https://facebook.com");
	  
	  //teste login
	  
	  driver.findElement(By.id("email")).sendKeys("vitorqa@outlook.com");
	  Assert.assertEquals("vitorqa@outlook.com", driver.findElement(By.id("email")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  //teste senha
	  
	  driver.findElement(By.id("pass")).sendKeys("teste123_");
	  Assert.assertEquals("teste123_", driver.findElement(By.id("pass")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  //botao login
	  
	  driver.findElement(By.className("_6ltg")).click();
	  Thread.sleep(600);	  
			}
					
	}
	

