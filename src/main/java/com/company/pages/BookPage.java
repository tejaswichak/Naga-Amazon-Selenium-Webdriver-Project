package com.company.pages;

import org.openqa.selenium.By;

import com.company.base.Page;

public class BookPage extends Page{

	public ShoppingCartPage addtoCart() {
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		
		return new ShoppingCartPage();
		
	}
}
