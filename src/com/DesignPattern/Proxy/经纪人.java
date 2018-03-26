package com.DesignPattern.Proxy;

public abstract class 经纪人 implements 歌手{
	
	protected 歌手 singer;
	
	public 经纪人(歌手 singer){
		this.singer = singer;
	}

	@Override
	public void 唱歌() {
		// TODO Auto-generated method stub
		this.singer.唱歌();
	}
	
	public abstract void 谈价格();
	
	public abstract void 签约();
	
	public abstract void 付钱();
	
}
