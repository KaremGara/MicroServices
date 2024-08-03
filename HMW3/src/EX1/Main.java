package EX1;

public class Main {

	public static void main(String[] args) {
		
		Products p=new Products("Bamba", 8.5);
		System.out.println("Product Info: \n"+p.display());
		System.out.println("Price including VAT: "+p.getPriceIncludingVat(p.getPrice()));
		
	}

}
