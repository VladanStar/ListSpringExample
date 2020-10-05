package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		FruitBasket basket = (FruitBasket)context.getBean("basket");
		System.out.println(basket.toString());
				
		
		((FileSystemXmlApplicationContext)context).close();

	}

}
