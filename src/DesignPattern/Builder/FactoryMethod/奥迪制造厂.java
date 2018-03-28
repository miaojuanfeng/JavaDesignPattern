package DesignPattern.Builder.FactoryMethod;

/*
 * 在工厂方法模式中，每个工厂只生产单一类型的产品，满足单一职责原则
 * 在本工厂中只生产单一品牌的汽车，不生产其他品牌的汽车
 */
public class 奥迪制造厂 implements 汽车工厂{
	
	@Override
	public 汽车 buildCar() {
		// TODO Auto-generated method stub
		return new 奥迪("奥迪牌", "28W");
	}
}
