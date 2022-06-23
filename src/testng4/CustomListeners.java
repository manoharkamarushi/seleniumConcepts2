package testng4;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
/*import org.testng.annotations.Test;*/

public class CustomListeners extends TestListenerAdapter{
  
	
	@Override
    public void onTestFailure(ITestResult tr) {
	  System.out.println(tr.getName()+"------Test method Failed \n");  
	    }
	@Override
	public void onTestSuccess(ITestResult tr){
		System.out.println(tr.getName()+"----- Test method success \n");
	}
	@Override
	public void onTestSkipped(ITestResult tr){
		System.out.println(tr.getName()+"---- Test method skipped \n");
	}
	@Override
	public void onTestStart(ITestResult tr){
		System.out.println(tr.getName()+"-----test method started \n");
	}
	

}
