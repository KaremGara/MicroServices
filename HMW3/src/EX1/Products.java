package EX1;

public class Products {

	
	private String productName;
	private double price;
	private static final double VAT=0.17;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Products(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	
	public Products() {}
	
	public double getPriceIncludingVat(double price) {
		return (price*VAT)+price;
	}
	public String display(){
		return "Product Name:"+getProductName()+"\n"
				+"Product Price: "+ getPrice();
	}
	
}
	

