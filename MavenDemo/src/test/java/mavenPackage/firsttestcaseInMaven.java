package mavenPackage;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
public class firsttestcaseInMaven {

	@Test
	public void test1(){
		System.out.println("first unit test case");
	}
	
	@Test
	public void testMiddle(){int a=10;
		int b=20;
		assertEquals(30, a+b);
		System.out.println("Laois");
	}
	
	@Test
	public void test2(){
		System.out.println("second unit test case");
	}
	
}
