package site;

import controller.ImageController;

public class testImage {
	
	ImageController ic = new ImageController();
	
	 @Test
	   public void testCalculateAppriasal() {
	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
			
	      double appraisal = empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(500, appraisal, 0.0);
	   }
}
