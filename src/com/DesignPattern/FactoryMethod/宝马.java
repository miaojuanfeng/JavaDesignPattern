package com.DesignPattern.FactoryMethod;

public class 宝马 extends 汽车{
	
	public 宝马(String name, String price){
		this.name = name;
		this.price = price;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(price+"的"+name+"车在奔跑");
	}
}
