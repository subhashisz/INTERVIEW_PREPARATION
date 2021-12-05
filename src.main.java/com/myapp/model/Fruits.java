package com.myapp.model;

import java.util.Objects;

public class Fruits {
	private String fruit_name;
	private long fruit_price;

	public Fruits() {
		super();
	}

	public Fruits(String fruit_name, long fruit_price) {
		super();
		this.fruit_name = fruit_name;
		this.fruit_price = fruit_price;
	}

	public String getFruit_name() {
		return fruit_name;
	}

	public void setFruit_name(String fruit_name) {
		this.fruit_name = fruit_name;
	}

	public long getFruit_price() {
		return fruit_price;
	}

	public void setFruit_price(long fruit_price) {
		this.fruit_price = fruit_price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fruit_name, fruit_price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruits other = (Fruits) obj;
		return Objects.equals(fruit_name, other.fruit_name) && fruit_price == other.fruit_price;
	}

	@Override
	public String toString() {
		return "Fruits [fruit_name=" + fruit_name + ", fruit_price=" + fruit_price + "]";
	}

}
