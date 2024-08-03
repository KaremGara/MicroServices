package EX2;

import java.util.Random;

public class ServiceClass {
	
	public static double getAverage(int a,int b, int c) {
		return (a+b+c)/3;
	}
	
	public static int getRandomNumber(int min, int max) {
	    if (min >= max) {
	        throw new IllegalArgumentException("max must be greater than min");
	    }
	    Random random = new Random();
	    return random.nextInt((max - min) + 1) + min;
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public static boolean isOdd(int num) {
	    return num % 2 != 0;
	}
	
}
