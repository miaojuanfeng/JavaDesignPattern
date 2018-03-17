package com.DesignPattern.Decorator;

public class 装饰 implements 墙 {
	
	墙 wall;
	
	public 装饰(墙 wall){
		this.wall = wall;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		this.wall.draw();
	}

}
