package com.DesignPattern.AbstractFactory;

/*
 * 与工厂方法不同的是，抽象工厂可以创建多个不同的产品配件，用于组装最终的产品
 * 工厂方法只能创建单一种类的产品
 * 抽象工厂与建造者的区别是：
 * 抽象工厂关注创建的配件的等级，用不同等级的配件来组成不同产品。
 * 建造者关注配件的组装顺序，采用相同的配件，根据不同的建造顺序组成不同的产品。
 */
public class 低档车工厂 implements 汽车工厂 {

	@Override
	public 轮胎 build轮胎() {
		// TODO Auto-generated method stub
		return new 低档轮胎();
	}

	@Override
	public 引擎 build引擎() {
		// TODO Auto-generated method stub
		return new 低档引擎();
	}

	@Override
	public 离合 build离合() {
		// TODO Auto-generated method stub
		return new 低档离合();
	}

}
