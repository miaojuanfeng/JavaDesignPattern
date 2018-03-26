package com.DesignPattern.Decorator;

/*
 * 装饰器定义成抽象类，防止被实例化
 */
public abstract class 装饰 implements 墙 {
	
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
