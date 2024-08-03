package EX3;

public class Main {

	  public static void main(String[] args) {
	        Book<String> book1 = new Book<>("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 29.99, 320, "image.jpg");
	        Book<Integer> book2 = new Book<>("1984", "George Orwell", 19.84, 328, 1984);

	        // Display details of both books
	        System.out.println(book1.display());
	        System.out.println(book2.display());
	    }

}
