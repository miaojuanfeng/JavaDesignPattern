package com.DesignPattern.Builder;

public class 动词导演 extends 导演{

	public 动词导演(词语建造者 factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getWord() {
		// TODO Auto-generated method stub
		return this.getWord2()+this.getWord1();
	}

}
