package com.company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.company.base.Page;

public class SearchPage extends Page{
	
	

	public BookPage searchBook(String bookname) {
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(bookname);
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]")).click();
	
		return new BookPage();
		
	}
}
