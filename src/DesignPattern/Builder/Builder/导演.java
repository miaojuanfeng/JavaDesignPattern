package DesignPattern.Builder.Builder;

/*
 * 抽象工厂加上导演角色，便是建造者模式了
 * 导演角色的职责是指挥抽象工厂创建构件的顺序，得到抽象工厂按照导演的指挥顺序构建好的对象，返回给客户端使用
 */
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
