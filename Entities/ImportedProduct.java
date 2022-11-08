package Entities;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct () {
		super();
	}
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	public Double getCustomsFee() {
		return customsFee;
	}
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	//public Double priceTag(Double totalPrice) {
		//totalPrice = getPrice() + customsFee;
	//return  totalPrice; 
	//}
	public String priceTag() {
		double totalPrice = 0;
		totalPrice = getPrice() + customsFee;
		return 			getName() 
					+ "  $  "
					+ totalPrice 
					+ "(Customs fee: $ " 
					+customsFee
					+ ")";
	}
	
	
}
