package DesignPattern.Builder.Builder;

public abstract class 词语建造者 {
	protected 词 word;
	/*
	 * 导演构造函数调用的时候，清空一下对象里的值
	 * 这里无关设计模式
	 */
	public void buidResult(){
		this.word = new 词();
	}
	/*
	 * 为导演提供建造过程的方法
	 */
	public abstract void buidNounWord();
	/*
	 * 为导演提供建造过程的方法
	 */
	public abstract void buidVerbWord();
	/*
	 * 由建造者将构建对象返回
	 */
	public abstract 词 getResult();
}
