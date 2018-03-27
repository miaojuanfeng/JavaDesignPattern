package com.DesignPattern.AbstractFactory;

/*
 * 可以随意添加实现类，实现汽车工厂接口自定义自己的配件等级，从而做到构建更多种类的产品。
 * 可以做到不修改其他实现类和接口，添加更多功能。
 * 从而满足开闭原则
 */
public class 自由组装车工厂 implements 汽车工厂 {

	@Override
	public 轮胎 build轮胎() {
		// TODO Auto-generated method stub
		return new 低档轮胎();
	}

	@Override
	public 引擎 build引擎() {
		// TODO Auto-generated method stub
		return new 高档引擎();
	}

	@Override
	public 离合 build离合() {
		// TODO Auto-generated method stub
		return new 中档离合();
	}

}
