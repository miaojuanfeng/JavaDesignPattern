package DesignPattern.Structure.Facade;

public class 电源 implements 门面{
	
	private 硬件 device1 = new 内存();
	private 硬件 device2 = new 显示器();
	private 硬件 device3 = new 硬盘();
	private 硬件 device4 = new 键盘();
	private 硬件 device5 = new 鼠标();

	@Override
	public void shartup() {
		// TODO Auto-generated method stub
		/*
		 * 由门面按顺序调用
		 * 不同的门面可以定义不同的顺序
		 */
		this.device1.startup();
		this.device2.startup();
		this.device3.startup();
		this.device4.startup();
		this.device5.startup();
	}

	@Override
	public void shutdonw() {
		// TODO Auto-generated method stub
		this.device1.shutdown();
		this.device2.shutdown();
		this.device3.shutdown();
		this.device4.shutdown();
		this.device5.shutdown();
	}

}
