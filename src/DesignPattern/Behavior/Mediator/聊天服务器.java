package DesignPattern.Behavior.Mediator;

public class 聊天服务器 extends 服务器{

	@Override
	public void sendMessage(客户端 client, String message) {
		// TODO Auto-generated method stub
		for(客户端 c : this.clients){
			if( !c.equals(client) ){
				c.receiveMessage(message);
			}
		}
	}

}
