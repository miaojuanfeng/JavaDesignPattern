package com.DesignPattern.Proxy;

public class 业余经纪人 extends 经纪人 {

	public 业余经纪人(歌手 singer) {
		super(singer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void 谈价格() {
		// TODO Auto-generated method stub
		System.out.println("业余经纪人谈好了价格");
	}

	@Override
	public void 签约() {
		// TODO Auto-generated method stub
		System.out.println("业余经纪人签好了合同");
	}

	@Override
	public void 付钱() {
		// TODO Auto-generated method stub
		System.out.println("业余经纪人收到了出场费");
	}
	
}
