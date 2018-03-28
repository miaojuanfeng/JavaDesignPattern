package DesignPattern.Behavior.Observer;

public class 追求者1 extends 追求者{
	
	/*
	 * 之所以需要保存美女的对象，是为了实现观察者模式的拉模型
	 * 如果采用推模型，则无需保存美女对象
	 */
	public 追求者1(美女 girl){
		this.lover = girl;
	}

	@Override
	public void listen() {
		// TODO Auto-generated method stub
		System.out.println("追求者1得到消息，美女的状态为"+this.lover.获取美女的恋爱状态());
	}

}
