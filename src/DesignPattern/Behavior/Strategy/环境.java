package DesignPattern.Behavior.Strategy;

public class 环境 {
	策略 strategy;
	
	public 环境(策略 strategy){
		this.strategy = strategy;
	}
	
	public double calcPrice(double price){
		return this.strategy.calcPrice(price);
	}
}
