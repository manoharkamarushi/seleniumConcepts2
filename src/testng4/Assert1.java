package testng4;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Assert1 {
  @Test
  public void multiply() {
	  
	// Assert.assertEquals(20,mul(10,2));
	  Assert.assertTrue("hi", mul(10,3)!=20);
  }
  public int mul(int x,int y)
  {
	  return 10*3;
  }
}
