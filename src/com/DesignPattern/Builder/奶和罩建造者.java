package com.DesignPattern.Builder;

public class 奶和罩建造者 implements 词语建造者 {

	@Override
	public 词 getWord1() {
		// TODO Auto-generated method stub
		return new 奶();
	}

	@Override
	public 词 getWord2() {
		// TODO Auto-generated method stub
		return new 罩();
	}

}
