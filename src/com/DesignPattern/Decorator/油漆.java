package com.DesignPattern.Decorator;

public class 油漆 extends 装饰 {

	public 油漆(墙 wall) {
		super(wall);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("刷油漆");
	}
	
	
}
