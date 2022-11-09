package Apllication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Scanner vh = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		List <Product> list = new ArrayList<>();	
		
		System.out.print("Enter the number of products: ");
		int quantProduct = vh.nextInt();	
		
		for (int i = 0; i < quantProduct; i++) {
			System.out.print("Common, used or imported (i/c/u)? ");
			char ch = vh.next().charAt(0);
			
			System.out.print("Name: ");
			String name = vh.next();
			
			System.out.print("Price: ");
			double price = vh.nextDouble();
			
			if (ch == 'i') {
				System.out.print("CustumsFee: ");			//importedProduct
				double customsFee = vh.nextDouble();				
				Product pro = new ImportedProduct(name, price, customsFee );
				list.add(pro);
			}
			if (ch == 'c') {	// product							
				Product prod = new Product(name, price);
				list.add(prod);			
			}
			if (ch == 'u') {
					System.out.print("Digite a data: ");
					Date manufactureData= formato.parse(vh.next());					
					Product produ = new UsedProduct(name, price, manufactureData);
					list.add(produ);					
			}
		}
		System.out.println("PRICE TAGS: ");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}		
		vh.close();
	}

}
