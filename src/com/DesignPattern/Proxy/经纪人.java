package com.DesignPattern.Proxy;

public class 经纪人 implements 歌手{
	
	歌手 singer;
	
	public 经纪人(歌手 singer){
		this.singer = singer;
	}

	@Override
	public void 唱歌() {
		// TODO Auto-generated method stub
		this.singer.唱歌();
	}
	
	public void 谈价格(){
		System.out.println("谈好了价格");
	}
	
	public void 签约(){
		System.out.println("签好了合同");
	}
	
	public void 付钱(){
		System.out.println("收到了出场费");
	}
	
}
