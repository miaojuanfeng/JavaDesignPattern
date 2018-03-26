package com.DesignPattern.FactoryMethod;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		奔驰制造厂 benzBuider = new 奔驰制造厂();
		汽车 car1 = benzBuider.buildCar();
		car1.run();
		奥迪制造厂 audiBuider = new 奥迪制造厂();
		汽车 car2 = audiBuider.buildCar();
		car2.run();
		宝马制造厂 bmwBuider = new 宝马制造厂();
		汽车 car3 = bmwBuider.buildCar();
		car3.run();
	}

}
