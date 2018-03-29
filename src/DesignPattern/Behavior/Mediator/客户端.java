package DesignPattern.Behavior.Mediator;

public abstract class 客户端 {
	
	protected 服务器 server;
	
	public 客户端(服务器 server){
		this.server = server;
	}
	
	public abstract void receiveMessage(String message);
	
	public void sendMessage(String message){
		this.server.sendMessage(this, message);
	}
}
