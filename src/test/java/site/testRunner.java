package site;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class testRunner {
	
	public static void main(String[] args) {
		//TODO more tests
		Result result = JUnitCore.runClasses(testImage.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}
	
}