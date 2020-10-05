package com.vladancupric;

import java.util.List;

public class FruitBasket {
	private String name;
	private List<String> list;
	public FruitBasket() {
		super();
	}
	public FruitBasket(String name, List<String> list) {
		super();
		this.name = name;
		this.list = list;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append("sadrzi: \n");
		for(String fruit: list) {
			System.out.println(fruit);
		}
		return sb.toString();
	}
	
	

}
