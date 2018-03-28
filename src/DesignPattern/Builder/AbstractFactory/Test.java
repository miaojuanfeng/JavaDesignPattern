package DesignPattern.Builder.AbstractFactory;

public class Test {

	public static void main(String[] args) {
		/*
		 * 抽象工厂模式
		 */
		高档车工厂 factory1 = new 高档车工厂();
		轮胎 tyre1 = factory1.build轮胎();
		引擎 engine1 = factory1.build引擎();
		离合 clutch1 = factory1.build离合();
		System.out.println(factory1.getName()+"建造了一辆由"+tyre1.getName()+","+engine1.getName()+","+clutch1.getName()+"构成的汽车");
		
		中档车工厂 factory2 = new 中档车工厂();
		轮胎 tyre2 = factory2.build轮胎();
		引擎 engine2 = factory2.build引擎();
		离合 clutch2 = factory2.build离合();
		System.out.println(factory2.getName()+"建造了一辆由"+tyre2.getName()+","+engine2.getName()+","+clutch2.getName()+"构成的汽车");
		
		低档车工厂 factory3 = new 低档车工厂();
		轮胎 tyre3 = factory3.build轮胎();
		引擎 engine3 = factory3.build引擎();
		离合 clutch3 = factory3.build离合();
		System.out.println(factory3.getName()+"建造了一辆由"+tyre3.getName()+","+engine3.getName()+","+clutch3.getName()+"构成的汽车");
		
		自由组装车工厂 factory4 = new 自由组装车工厂();
		轮胎 tyre4 = factory4.build轮胎();
		引擎 engine4 = factory4.build引擎();
		离合 clutch4 = factory4.build离合();
		System.out.println(factory4.getName()+"建造了一辆由"+tyre4.getName()+","+engine4.getName()+","+clutch4.getName()+"构成的汽车");
	}

}
