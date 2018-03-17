package com.DesignPattern.Decorator;

public class 腻子粉 extends 装饰{

	public 腻子粉(墙 wall) {
		super(wall);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("刷腻子粉");
	}
	
	
}
