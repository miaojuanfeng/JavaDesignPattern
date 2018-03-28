package DesignPattern.Builder.FactoryMethod;

/*
 * 在工厂方法模式中，每个工厂只生产单一类型的产品，满足单一职责原则
 */
public interface 汽车工厂 {
	public 汽车 buildCar();
}
