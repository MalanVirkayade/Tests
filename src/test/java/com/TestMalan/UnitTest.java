package com.TestMalan;

import org.junit.Assert;
import org.testng.annotations.Test;

public class UnitTest {
  @Test
  public void canGoToHomePage() 
  {
	 Pages.homePage().goTo();
	 Assert.assertTrue(Pages.homePage().isAt());
	 
  }
}
