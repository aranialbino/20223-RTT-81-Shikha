package coffeeshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {
	// this is the menu of the coffee shop has to offer
	List<Product> products = new ArrayList<>();
	// this is the list of items in your order
	List<Product> order = new ArrayList<>();
	// this is a class member variable to make it easier
	Scanner input = new Scanner(System.in);

	public void setupProducts() {
		Product coffee = new Product();
		coffee.setName("coffee");
		coffee.setPrice(5.44);
		products.add(coffee);

		Product tea = new Product();
		tea.setName("Tea");
		tea.setPrice(4.33);
		products.add(tea);

		Product cookie = new Product();
		cookie.setName("cookie");
		cookie.setPrice(6.77);
		products.add(cookie);

		Product sandwich = new Product();
		sandwich.setName("Egg & cheese Muffin");
		sandwich.setPrice(19.99);
		products.add(sandwich);
		
	}

	public void printProduct(Product product) {
		System.out.println("Product name-\t" + product.getName() + ("\tPrice-\t\t" + product.getPrice()));
	}

	public void printAllProducts() {

		for (Product product : products) {
			printProduct(product);
		}
	}

	public  void example() {

		// the value in each product is the price
		double coffee = 5.43;
		double tea = 4.33;
		double cookie = 6.76;
		double subtotal = 0;
		subtotal = coffee * 3;
		subtotal = subtotal + (tea * 4);
		subtotal = subtotal + (cookie * 2);
		System.out.println("subtotal:\t\t" + subtotal);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("subtotal\t\t" + df.format(subtotal));
		double salestax = subtotal * (9 / 100);
		System.out.println("salestax; \t\t" + df.format(salestax));
		double totalSale = subtotal + salestax;
		System.out.println("totalSale;\t\t " + df.format(totalSale));
	}

	public int displayMainUserMenu() {
		System.out.println("1 print the menu items and prices");
		System.out.println("2 add an item to your order");
		System.out.println("3 print the items in you order");
		System.out.println("4 checkout");
		System.out.println("5 Exit");

		System.out.println("\n what do you want to do?");
		int select = input.nextInt();
		input.nextLine();
		return select;
	}

	public void userSelectProduct() {
		System.out.print("Enter product name to order");
		String orderSelection = input.nextLine();
		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(orderSelection)) {
				order.add(product);
				System.out.println("Added " + product.getName() + " to your order.");
			}
		}
	}

	
	
	public static void main(String[] args) {
		CoffeeShop cf = new CoffeeShop();
		cf.setupProducts();

			while (true) {
				int userSelection = cf.displayMainUserMenu();

				if (userSelection == 1) {
					cf.printAllProducts();
				} else if (userSelection == 2) {
					cf.userSelectProduct();
				} else if (userSelection == 3) {
					// TODO HOMEWOK - display the products in the order list here
				} else if (userSelection == 5) {
					System.exit(0);
				} else {
					System.out.println("User input " + userSelection + " is unknonw.   Try again;");
				}
			}
		}
	}

