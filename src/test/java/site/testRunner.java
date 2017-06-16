package site;
import junit.*;


public class testRunner {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(testImage.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}
	
}