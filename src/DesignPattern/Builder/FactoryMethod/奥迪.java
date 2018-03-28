package DesignPattern.Builder.FactoryMethod;

public class 奥迪 extends 汽车 {
	
	public 奥迪(String name, String price){
		this.name = name;
		this.price = price;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(price+"的"+name+"车在奔跑");
	}
}
