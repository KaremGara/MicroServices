package EX;

public class SalesPerson extends Employee implements Comparable<SalesPerson> {
	
	private String certificationNumber;
	
    public SalesPerson(String employeeName, int employeeAge, double employeeSalary, String certificationNumber)
            throws InvalidEmployeeCertException {
        super(employeeName, employeeAge, employeeSalary);
        if (!isValidCertificationNumber(certificationNumber)) {
            throw new InvalidEmployeeCertException("Invalid certification number format.");
        }
        this.certificationNumber = certificationNumber;
    }
	
	boolean isValidCertificationNumber(String certNumber){
		
		if(certNumber.length()!=7 || certNumber==null) return false;
		
		
		
		 // Check the position of the dash
        if (certNumber.charAt(3) != '-') {
            return false;
        }
		
		String part1=certNumber.substring(0, 3);
		
		
		String part2=certNumber.substring(4, 7);
		
		
	    if (!isNumeric(part1) || !isAlphabetic(part2)) {
            return false;
        }
	    
	    return true;
	}
	
	  public String getCertificationNumber() {
		return certificationNumber;
	}

	private boolean isNumeric(String part1) {
	        for (char c : part1.toCharArray()) {
	            if (!Character.isDigit(c)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    private boolean isAlphabetic(String part2) {
	        for (char c : part2.toCharArray()) {
	            if (!Character.isLetter(c)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public void setCertificationNumber(String certificationNumber) throws InvalidEmployeeCertException {
	        if (!isValidCertificationNumber(certificationNumber)) {
	            throw new InvalidEmployeeCertException("Invalid certification number format.");
	        }
	        this.certificationNumber = certificationNumber;
	    }

	    @Override
	    public int compareTo(SalesPerson other) {
	        if (this.getEmployeeSalary() > other.getEmployeeSalary()) {
	            return 1;
	        } else if (this.getEmployeeSalary() < other.getEmployeeSalary()) {
	            return -1;
	        } else {
	            return 0;
	        }
	    }
}


