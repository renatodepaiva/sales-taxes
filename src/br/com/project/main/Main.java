package br.com.project.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.project.order.Order;
import br.com.project.product.Product;
import br.com.project.product.Product.ProductOrigin;
import br.com.project.product.Product.ProductType;

public class Main {
	public static void main(String[] args) {

		// Input 1
		List<Product> productList1 = new ArrayList<>();
		Product book = new Product(1, "book", ProductType.BOOK, ProductOrigin.LOCAL, new BigDecimal("12.49"));
		Product cd = new Product(1, "music CD", ProductType.OTHER, ProductOrigin.LOCAL, new BigDecimal("14.99"));
		Product chocolateBar = new Product(1, "chocolate bar", ProductType.FOOD, ProductOrigin.LOCAL, new BigDecimal("0.85"));
		productList1.add(book);
		productList1.add(cd);
		productList1.add(chocolateBar);

		// Input 2
		List<Product> productList2 = new ArrayList<>();
		Product importedChocolate = new Product(1, "imported box of chocolates", ProductType.FOOD, ProductOrigin.IMPORTED, new BigDecimal("10.00"));
		Product importedPerfume1 = new Product(1, "imported bottle of perfume", ProductType.OTHER, ProductOrigin.IMPORTED, new BigDecimal("47.50"));
		productList2.add(importedChocolate);
		productList2.add(importedPerfume1);

		// Input 3
		List<Product> productList3 = new ArrayList<>();
		Product importedPerfume2 = new Product(1, "imported bottle of perfume", ProductType.OTHER, ProductOrigin.IMPORTED, new BigDecimal("27.99"));
		Product perfume = new Product(1, "bottle of perfume", ProductType.OTHER, ProductOrigin.LOCAL, new BigDecimal("18.99"));
		Product headachePills = new Product(1, "packet of headache pills", ProductType.MEDICINE, ProductOrigin.LOCAL, new BigDecimal("9.75"));
		Product importedChocolate2 = new Product(1, "imported box of chocolates", ProductType.FOOD, ProductOrigin.IMPORTED, new BigDecimal("11.25"));
		productList3.add(importedPerfume2);
		productList3.add(perfume);
		productList3.add(headachePills);
		productList3.add(importedChocolate2);

		Order.print(productList1); // Output 1
		Order.print(productList2); // Output 2
		Order.print(productList3); // Output 3
	}
}
