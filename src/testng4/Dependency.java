package testng4;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Dependency {
  @Test
  public void testMethodOne() throws Exception{
	  	  //gmail login code
	  
	  
	  Assert.assertTrue(true);
	  
  }
  @Test (dependsOnMethods={"testMethodOne"})
  public void testMethodTwo() throws Exception{
	  //gmail compose code
	  Assert.assertTrue(true);
	  
  }
  @Test (dependsOnMethods={"testMethodTwo"})
  public void testMethodThree(){
	  //gmail logout code
	  Assert.assertTrue(true);
  }
}
