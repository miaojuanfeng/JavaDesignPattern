package DesignPattern.Structure.Facade;

public class 键盘 implements 硬件{

	@Override
	public void startup() {
		// TODO Auto-generated method stub
		System.out.println("链接键盘");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("断开键盘");
	}
	
}
