package com.hsbc.banking.utility;

import java.util.Scanner;

import com.hsbc.banking.models.Product;

public class RetailPriceCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//develop solution using switch case to calculate retail price
	    //prices of three different products
		float[] priceList= {22.50f,9.98f,44.5f};
		
		Scanner scanner =new Scanner(System.in);
	    //Read Product Id and Quantity as pair of values
	    System.out.println("Enter Product Id and Quantity(id,qty)");
	    String input=scanner.nextLine();
	    //split the values using delimiter
	    String[] inputArray=input.split(",");
	    Product product=new Product();
	    product.setProductId(Byte.parseByte(inputArray[0]));
	    product.setQuantity(Byte.parseByte(inputArray[1]));
	    
	    switch(product.getProductId())
	    {
	    case 1:product.setRetailPrice(product.getQuantity()*
	    		priceList[product.getProductId()-1]);
	    break;
	    
	    case 2:product.setRetailPrice(product.getQuantity()*
	    		priceList[product.getProductId()-1]);
	    break;
	    
	    case 3:product.setRetailPrice(product.getQuantity()*
	    		priceList[product.getProductId()-1]);
	    break;
	    default:
	    	product.setRetailPrice(product.getQuantity()*1);
	    
	    }
	    
	    
	    System.out.println("Product Retail Price.......");
	    System.out.println("Product Id="+product.getProductId());
	    
	    System.out.println("Product Quantity="+product.getQuantity());
	    System.out.println("Product Retail Price="+product.getRetailPrice());
	    
		
		
	}

}
