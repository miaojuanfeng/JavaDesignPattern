package DesignPattern.Structure.Facade;

public class Test {
	public static void main(String[] args){
		/*
		 * 普通使用
		 */
		硬件 device1 = new 内存();
		硬件 device2 = new 显示器();
		硬件 device3 = new 硬盘();
		硬件 device4 = new 键盘();
		硬件 device5 = new 鼠标();
		/*
		 * 客户端要一个一个创建对象然后调用方法
		 */
		device1.startup();
		device2.startup();
		device3.startup();
		device4.startup();
		device5.startup();
		/*
		 * 对象和客户端紧耦合在一起，客户端必须知道组成电脑的所有组件，一个一个调用方法。
		 * 甚至有的对象会有调用顺序限制，客户端也必须知晓
		 */
		device1.shutdown();
		device2.shutdown();
		device3.shutdown();
		device4.shutdown();
		device5.shutdown();
		/*
		 * 门面模式
		 * 客户端只需与门面交互，无需知晓电脑的具体细节
		 * 开硬件的顺序也可以由不同门面定制
		 */
		门面 power = new 电源();
		power.shartup();
		power.shutdonw();
	}
}
