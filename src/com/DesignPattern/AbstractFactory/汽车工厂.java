package com.DesignPattern.AbstractFactory;

public interface 汽车工厂 {
	public 轮胎 build轮胎();
	public 引擎 build引擎();
	public 离合 build离合();
}
