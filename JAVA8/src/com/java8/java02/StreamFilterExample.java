package com.java8.java02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
        //Print products who have 25000f above price in Traditional way without using stream Api
		List<Product> list = new ArrayList<Product>();
		for(Product product : getProducts() ) {
			if(product.getPrice() > 25000f) {
				list.add(product);
			}
		}
		for(Product product : list) {
			 System.out.println(product);
		}
		//using Stream API
		/*List<Product>  list2 = getProducts()
				                           .stream().filter( (product) ->  product.getPrice()  >  25000f) 
				                           .collect( Collectors.toList() );
		System.out.println("====Using StreamAPI====");
		  list2.forEach(System.out::println);
		  */
		System.out.println("====Using StreamAPI====");
		 getProducts()
				              .stream().filter((product) ->  product.getPrice()  >  25000f) 
				                           .forEach(System.out::println);
	}

	private static List<Product> getProducts() {
		List<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product(1, "HP Laptop", 25000f));
		productlist.add(new Product(2, "Dell LAptop", 30000f));
		productlist.add(new Product(2, "Lenevo Laptop", 28000f));
		productlist.add(new Product(3, "Sony Laptop", 28000f));
		productlist.add(new Product(4, "Apple Laptop", 9000f));
		return productlist;
	}
}

class Product {
	private int id;
	private String name;
	private float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
