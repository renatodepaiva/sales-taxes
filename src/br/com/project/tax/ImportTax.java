package br.com.project.tax;

import java.math.BigDecimal;

import br.com.project.product.Product;

public class ImportTax implements Tax {
	private final BigDecimal TAX_VALUE = new BigDecimal("0.05");
	private final BigDecimal ROUND_FACTOR = new BigDecimal("0.05");

	public BigDecimal calculateTax(Product product) {
		if (isEligible(product)) {
			return round(product.getPrice().multiply(TAX_VALUE));
		}
		return BigDecimal.ZERO;
	}

	public boolean isEligible(Product product) {
		switch (product.getOrigin()) {
		case LOCAL:
			return false;
		default:
			return true;
		}
	}

	private BigDecimal round(BigDecimal value) {
		BigDecimal roundedValue = value.divide(ROUND_FACTOR);
		roundedValue = new BigDecimal(Math.ceil(roundedValue.doubleValue()));
		roundedValue = roundedValue.multiply(ROUND_FACTOR);
		return roundedValue;
	}
}
