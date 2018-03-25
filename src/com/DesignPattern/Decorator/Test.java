package com.DesignPattern.Decorator;

public class Test {
	public static void main(String[] args){
		/**
		 * 装饰模式
		 */
		装饰 decorator1 = new 墙纸(new 腻子粉(new 毛坯墙()));
		decorator1.draw();
		装饰 decorator2 = new 油漆(new 腻子粉(new 毛坯墙()));
		decorator2.draw();
	}
}
