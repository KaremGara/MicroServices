package EX4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = IntStream.range(0, 5)
            .mapToObj(i -> {
                System.out.println("Enter string " + (i + 1) + ":");
                return scanner.nextLine();
            })
            .collect(Collectors.toList());
        
  
       

        int maxLength = strings.stream()
            .mapToInt(String::length)
            .max()
            .orElse(0);

        List<String> longestStrings = strings.stream()
            .filter(s -> s.length() == maxLength)
            .collect(Collectors.toList());

        System.out.println("The length of the longest string(s) is: " + maxLength);

        System.out.println("The longest string(s):");
        longestStrings.forEach(System.out::println);

        // Close the scanner
        scanner.close();
    }

	

}

