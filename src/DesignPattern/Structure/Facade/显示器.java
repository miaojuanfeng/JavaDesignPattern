package DesignPattern.Structure.Facade;

public class 显示器 implements 硬件{

	@Override
	public void startup() {
		// TODO Auto-generated method stub
		System.out.println("开启显示器");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("关闭显示器");
	}

}
