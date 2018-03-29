package DesignPattern.Structure.Facade;

public class 硬盘 implements 硬件{

	@Override
	public void startup() {
		// TODO Auto-generated method stub
		System.out.println("开启硬盘");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("关闭硬盘");
	}

}
