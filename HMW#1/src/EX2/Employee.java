package EX2;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date dateOfEmployment;
	public Employee(String firstName, String lastName, Date birthDate, Date dateOfEmployment) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.dateOfEmployment = dateOfEmployment;
	}
	  public String getFullName() {
	        return firstName + " " + lastName;
	    }

	    @Override
	    public String toString() {
	        return "Employee Details:\n" +
	               "Full Name: " + getFullName() + "\n" +
	               "Birth Date: " + birthDate + "\n" +
	               "Date of Employment: " + dateOfEmployment;
	    }
	
	
	
	
	
	

}
