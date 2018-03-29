package DesignPattern.Behavior.Mediator;

public class 玩家1 extends 客户端{

	public 玩家1(服务器 server) {
		super(server);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void receiveMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("玩家1接收到消息："+message);
	}

}
