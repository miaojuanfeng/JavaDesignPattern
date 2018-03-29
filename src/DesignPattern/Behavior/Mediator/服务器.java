package DesignPattern.Behavior.Mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class 服务器 {
	/*
	 * 借用观察者模式中的队列来保存客户端
	 * 实现动态增加删除客户端的能力
	 */
	protected List<客户端> clients = new ArrayList<客户端>();
	
	public void addClient(客户端 client){
		this.clients.add(client);
	}
	
	public void removeClient(客户端 client){
		this.clients.remove(client);
	}
	
	public abstract void sendMessage(客户端 client, String message);
	
}
