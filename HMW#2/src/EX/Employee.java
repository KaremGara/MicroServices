package EX;

public class Employee {
	
	private static final int MAXIMUM_SALARY=40000;
	
	private String employeeName;
	
	private int employeeAge;
	
	private double employeeSalary;
	
	public Employee(String employeeName,int employeeAge, double employeeSalary) throws InvalidEmployeeCertException {
		
			this.employeeAge=employeeAge;
			this.employeeName=employeeName;
			setEmployeeSalary(employeeSalary);
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) throws InvalidEmployeeCertException {
		if(employeeSalary>MAXIMUM_SALARY) {
			throw new InvalidEmployeeCertException("The Salary cannot be more than: "+ MAXIMUM_SALARY);
		}
		this.employeeSalary=employeeSalary;
	}
	
	
	

}
