package br.com.project.tax;

import java.math.BigDecimal;

import br.com.project.product.Product;

public interface Tax {
	public BigDecimal calculateTax(Product product);

	public boolean isEligible(Product product);
}
