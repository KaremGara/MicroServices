package EX;

public class Main {

	public static void main(String[] args) throws InvalidEmployeeCertException {
		
		 try {
			   SalesPerson sp1 = new SalesPerson("Daoud Kabha", 30, 20000, "123-ABC");
	            SalesPerson sp2 = new SalesPerson("Ameen Java", 28, 10000, "124-DEF");
	            SalesPerson sp3 = new SalesPerson("Karem Ghara", 27, 6000, "125-GHI");
	            
	            // Comparison results
	            int comparisonResult1 = sp1.compareTo(sp2);
	            int comparisonResult2 = sp1.compareTo(sp3);
	            
	            // Print comparison results
	            if (comparisonResult1 > 0) {
	                System.out.println(sp2.getEmployeeName() + " has a smaller salary than " + sp1.getEmployeeName());
	            } else if (comparisonResult1 < 0) {
	                System.out.println(sp1.getEmployeeName() + " has a smaller salary than " + sp2.getEmployeeName());
	            } else {
	                System.out.println(sp1.getEmployeeName() + " and " + sp2.getEmployeeName() + " have equal salaries.");
	            }

	            if (comparisonResult2 > 0) {
	                System.out.println(sp3.getEmployeeName() + " has a smaller salary than " + sp1.getEmployeeName());
	            } else if (comparisonResult2 < 0) {
	                System.out.println(sp1.getEmployeeName() + " has a smaller salary than " + sp3.getEmployeeName());
	            } else {
	                System.out.println(sp1.getEmployeeName() + " and " + sp3.getEmployeeName() + " have equal salaries.");
	            }
	        } catch (InvalidEmployeeCertException e) {
	            e.printStackTrace();
	        }

	}

}
