package com.company.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.company.pages.BookPage;
import com.company.pages.SearchPage;
import com.company.pages.ShoppingCartPage;

public class SearchTest {

	public static void main(String[] args) {
	
	    SearchPage search = new SearchPage();
	    BookPage bpage = search.searchBook("qa testing for beginners");
	    ShoppingCartPage spage = bpage.addtoCart();
	    Assert.assertEquals(47.49, 47.49);
		spage.proceedtoCheckOut();
		Assert.assertEquals(47.49, 47.49);
	}

	
}
