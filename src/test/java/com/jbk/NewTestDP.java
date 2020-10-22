package com.jbk;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTestDP {
 

  @DataProvider
  public Object[][] login() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  @DataProvider
  public Object[][]addUser() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
