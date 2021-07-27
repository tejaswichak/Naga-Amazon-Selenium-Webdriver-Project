package com.company.pages;

import org.openqa.selenium.By;

import com.company.base.Page;

public class ShoppingCartPage extends Page{

	public void proceedtoCheckOut() {
		
		driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).click();
	}
}
