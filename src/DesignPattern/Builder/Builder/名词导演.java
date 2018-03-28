package DesignPattern.Builder.Builder;

public class 名词导演 extends 导演{

	public 名词导演(词语建造者 factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 先构建名词，
	 * 后构建动词
	 * 最终构建的是名词对象
	 */
	@Override
	public 词 construct() {
		// TODO Auto-generated method stub
		this.factory.buidNounWord();
		this.factory.buidVerbWord();
		return this.factory.getResult();
	}
}
