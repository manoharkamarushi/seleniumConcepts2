package junit_samples;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Priority_test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("am from before class -setup ");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("am from after class tear down");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("am from before test-setup");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("am from after test- teardown");
	}

	@Test
	public void test() {
		System.out.println("am from test method");
	}
	@Ignore
	public void test1(){
		System.out.println("am ignored- not executed like @test(enabled=false)");
	}
}
