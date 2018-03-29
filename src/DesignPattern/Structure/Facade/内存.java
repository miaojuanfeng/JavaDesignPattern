package DesignPattern.Structure.Facade;

public class 内存 implements 硬件{

	@Override
	public void startup() {
		// TODO Auto-generated method stub
		System.out.println("开启内存");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("关闭内存");
	}

}
