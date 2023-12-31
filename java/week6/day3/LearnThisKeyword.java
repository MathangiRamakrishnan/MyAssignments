package week6.day3;

public class LearnThisKeyword {
	
	String idNum;
	
	public void employee() {
		System.out.println("Employee Name : Mathangi");
		
	}
	
	public void empId(String idNum) {
		System.out.println("=============");
	//	LearnThisKeyword ltk = new LearnThisKeyword();
	//	ltk.idNum = idNum;
		this.idNum = idNum;
		this.employee();
		System.out.println("Local variable : " + idNum);
		this.employeeDetails();
		System.out.println("Global Variable : " + this.idNum);
		System.out.println("=============");
		
	}
	
	public void employeeDetails() {
		System.out.println("Employee Details: Please mention ");
		
	}
	
	public static void main(String[] args) {
		
		LearnThisKeyword ltk = new LearnThisKeyword();
		ltk.employee();
		ltk.empId("TL234");
		ltk.employeeDetails();
		System.out.println(ltk.idNum);
		

	}

}
