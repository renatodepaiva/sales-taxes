package br.com.project.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.project.product.Product;
import br.com.project.tax.ImportTax;
import br.com.project.tax.StandardTax;
import br.com.project.tax.Tax;

public class Order {

	public static void print(List<Product> products) {
		List<Tax> taxes = new ArrayList<>();
		taxes.add(new StandardTax());
		taxes.add(new ImportTax());

		BigDecimal orderTotal = BigDecimal.ZERO;
		BigDecimal salesTaxes = BigDecimal.ZERO;

		for (Product product : products) {
			BigDecimal productTaxes = BigDecimal.ZERO;
			for (Tax tax : taxes) {
				productTaxes = productTaxes.add(tax.calculateTax(product));
			}
			BigDecimal productFinalPrice = product.getPrice().add(productTaxes);

			System.out.println(String.format("%s %s: %s", product.getAmount(), product.getName(), productFinalPrice));
			salesTaxes = salesTaxes.add(productTaxes);
			orderTotal = orderTotal.add(productFinalPrice);
		}
		System.out.println(String.format("Sales Taxes: %s", salesTaxes));
		System.out.println(String.format("Total: %s\n", orderTotal));
	}
}