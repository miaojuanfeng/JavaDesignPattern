package com.DesignPattern.Builder;

public class 名词导演 extends 导演{

	public 名词导演(词语建造者 factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getWord() {
		// TODO Auto-generated method stub
		return this.getWord1()+this.getWord2();
	}

}
