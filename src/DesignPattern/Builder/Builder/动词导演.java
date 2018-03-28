package DesignPattern.Builder.Builder;

public class 动词导演 extends 导演{

	public 动词导演(词语建造者 factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 先构建动词，
	 * 后构建名词
	 * 最终构建的是动词对象
	 */
	@Override
	public 词 construct() {
		// TODO Auto-generated method stub
		this.factory.buidVerbWord();
		this.factory.buidNounWord();
		return this.factory.getResult();
	}

}
