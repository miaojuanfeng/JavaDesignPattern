package DesignPattern.Behavior.Mediator;

public class 玩家2 extends 客户端{

	public 玩家2(服务器 server) {
		super(server);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void receiveMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("玩家2接收到消息："+message);
	}

}
