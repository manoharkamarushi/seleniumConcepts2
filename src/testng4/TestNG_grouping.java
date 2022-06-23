package testng4;

import org.testng.annotations.Test;

public class TestNG_grouping {
	
  @Test(groups="Retestng",priority=1)
  public void testcase1() {
	  
	  System.out.println("Iam in retesting");
	    }
  @Test(groups="Regressiontesting",priority=0)
   public void testcase2(){
	  System.out.println(" im from regression testing ..");
	  
  }
  @Test(groups="Retesting",priority=0)
  public void testcase3(){
	  System.out.println("im am from retesting");
	  
  }
}
