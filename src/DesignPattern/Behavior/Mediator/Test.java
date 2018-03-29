package DesignPattern.Behavior.Mediator;

public class Test {
	public static void main(String[] args){
		/*
		 * 普通实现
		 * 这种方法把对象紧紧耦合在一起，当要新增或修改客户端时，满足不了开闭原则
		 */
		客户端 client1 = new 玩家1(null);
		客户端 client2 = new 玩家2(null);
		客户端 client3 = new 玩家3(null);
		/*
		 * 玩家1需要发送消息给其他玩家时，需要调用其他玩家的receiveMessage方法
		 */
		String message = "Hello World from Client1";
		client2.receiveMessage(message);
		client3.receiveMessage(message);
		/*
		 * 玩家2需要发送消息给其他玩家时，需要调用其他玩家的receiveMessage方法
		 */
		message = "Hello World from Client2";
		client1.receiveMessage(message);
		client3.receiveMessage(message);
		/*
		 * 中介者模式
		 */
		服务器 server = new 聊天服务器();
		/*
		 * 将服务器注册到客户端中
		 */
		client1 = new 玩家1(server);
		client2 = new 玩家2(server);
		client3 = new 玩家3(server);
		/*
		 * 将客户端注册到服务器中
		 */
		server.addClient(client1);
		server.addClient(client2);
		server.addClient(client3);
		/*
		 * 客户端发消息时，只需要与服务器通信，服务器转发消息到其他客户端
		 * 服务器实现的便是中介者职责
		 */
		client1.sendMessage("Hello World from Client1");
		client2.sendMessage("Hello World from Client2");
		client3.sendMessage("Hello World from Client3");
	}
}
