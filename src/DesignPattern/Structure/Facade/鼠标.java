package DesignPattern.Structure.Facade;

public class 鼠标 implements 硬件{

	@Override
	public void startup() {
		// TODO Auto-generated method stub
		System.out.println("链接鼠标");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("断开鼠标");
	}

}
