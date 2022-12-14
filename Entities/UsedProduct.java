package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureData;
	
	public UsedProduct () {
		super();
	}
	public UsedProduct(String name, Double price, Date manufactureData) {
		super(name, price);
		this.manufactureData = manufactureData;
	}
	public Date getManufactureData() {
		return manufactureData;
	}
	public void setManufactureData(Date manufactureData) {
		this.manufactureData = manufactureData;
	}
	@Override
	public String priceTag() {
		return 			getName() 
					+ "   (Used)  $  "
					+ getPrice()
					+ "   Manufacture Data: " 
					+ formato.format(manufactureData);
	}	
}
