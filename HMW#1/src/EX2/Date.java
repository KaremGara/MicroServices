package EX2;

public class Date {
	
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public int checkMonth(int month){
		if(month>=1 || month<=12) {
			return month;
		}
		else {
			System.out.println("Invalid Month");
			return 1;
		}
		
	}
	public int checkDay(int day) {
		if(day>=1 || day<=31) {
			return day;
		}
		else if(month==2) {
			return day=28;
		}
		else {
			System.out.println("Invalid Day");
			return 1;

		}
	}

	@Override
	public String toString() {
		return day +"/" + month + "/" + year;
	}
	
	
	

}
