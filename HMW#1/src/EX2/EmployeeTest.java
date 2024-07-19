package EX2;

public class EmployeeTest {
	
	  public static void main(String[] args) {
	        Date birth = new Date(11, 27, 1986);
	        Date hire = new Date(12, 3, 2010);
	        Employee employee = new Employee("Rany", "Albeg Wein", birth, hire);
	        System.out.println(employee);
	    }

}
