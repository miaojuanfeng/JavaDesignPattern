package DesignPattern.Builder.AbstractFactory;

public abstract class 汽车工厂 {
	protected String name;
	
	public 汽车工厂(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public abstract 轮胎 build轮胎();
	public abstract 引擎 build引擎();
	public abstract 离合 build离合();
}
