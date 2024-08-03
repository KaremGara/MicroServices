package EX3;

public class Book<T> {
	
	private String bookName;
	private String bookauthor;
	private double bookPrice;
	private int pageNumber;
	private T attribute;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public T getAttribute() {
		return attribute;
	}
	public void setAttribute(T attribute) {
		this.attribute = attribute;
	}
	public Book(String bookName, String bookauthor, double bookPrice, int pageNumber, T attribute) {
		super();
		this.bookName = bookName;
		this.bookauthor = bookauthor;
		this.bookPrice = bookPrice;
		this.pageNumber = pageNumber;
		this.attribute = attribute;
	}
	public Book() {}
	
	  public String display() {
	        return "Book Name: " + bookName + "\n" +
	               "Book Author: " + bookauthor + "\n" +
	               "Book Price: " + bookPrice + "\n" +
	               "Page Numbers: " + pageNumber + "\n" +
	               "Book Attribute: " + attribute + "\n";
	    }
	
	

}
