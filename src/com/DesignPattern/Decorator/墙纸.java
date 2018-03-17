package com.DesignPattern.Decorator;

public class 墙纸 extends 装饰 {

	public 墙纸(墙 wall) {
		super(wall);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("贴墙纸");
	}
	
	

}
