package com.DesignPattern.Builder;

public abstract class 导演 {
	private 词语建造者 factory;
	
	public 导演(词语建造者 factory){
		this.factory = factory;
	}
	
	public String getWord1(){
		return this.factory.getWord1().getWord();
	}
	
	public String getWord2(){
		return this.factory.getWord2().getWord();
	}
	
	public abstract String getWord();
}
