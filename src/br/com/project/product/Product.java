package br.com.project.product;

import java.math.BigDecimal;

public class Product {

	public enum ProductType {
		BOOK, FOOD, MEDICINE, OTHER;
	}

	public enum ProductOrigin {
		LOCAL, IMPORTED;
	}

	private int amount;
	private String name;
	private ProductType type;
	private ProductOrigin origin;
	private BigDecimal price;

	public Product() {
	}

	public Product(int amount, String name, ProductType type, ProductOrigin origin, BigDecimal price) {
		this.amount = amount;
		this.name = name;
		this.type = type;
		this.origin = origin;
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public ProductOrigin getOrigin() {
		return origin;
	}

	public void setOrigin(ProductOrigin origin) {
		this.origin = origin;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [amount=" + amount + ", name=" + name + ", type=" + type + ", origin=" + origin + ", price="
				+ price + "]";
	}
}