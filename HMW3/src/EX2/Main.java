package EX2;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Average of the 10,3,2 is : " + ServiceClass.getAverage(10, 3, 2));
		 System.out.println("Average of the 10, 3, 2 is : " + ServiceClass.getAverage(10, 3, 2));

	        int randomNumber = ServiceClass.getRandomNumber(10, 20);
	        System.out.println("Random number between 10 and 15: " + randomNumber);
	        System.out.println("Checking if the Random Number " + randomNumber + " is Even: " + ServiceClass.isEven(randomNumber));
	        System.out.println("Checking if the Random Number " + randomNumber + " is Odd: " + ServiceClass.isOdd(randomNumber));

	}

}
