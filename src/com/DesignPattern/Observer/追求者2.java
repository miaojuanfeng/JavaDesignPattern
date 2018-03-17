package com.DesignPattern.Observer;

public class 追求者2 extends 追求者{
	
	public 追求者2(美女 girl){
		this.lover = girl;
	}

	@Override
	public void listen() {
		// TODO Auto-generated method stub
		System.out.println("追求者2得到消息，美女的状态为"+this.lover.getStatus());
	}

}
