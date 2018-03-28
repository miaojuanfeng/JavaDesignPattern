package com.DesignPattern.Builder;

public abstract class 导演 {
	protected 词语建造者 factory;
	
	public 导演(词语建造者 factory){
		this.factory = factory;
		this.factory.buidResult();
	}
	
	/*
	 * 导演角色的职责是，改变构件的建造顺序后，建造出来的产品是不一样的
	 */
	public abstract 词 construct();
}
