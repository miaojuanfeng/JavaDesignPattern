package DesignPattern.Behavior.Handler;

public class Test {
	public static void main(String[] args){
		/*
		 * 责任链模式
		 */
		//构建责任链
		报销处理者 handler1 = new 组长();
		报销处理者 handler2 = new 经理();
		报销处理者 handler3 = new 老总();
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		
		double total = 780;
		try{
			handler1.handler(total);	//从职权范围最低的处理者开始
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		//新增财务处理者
		报销处理者 handler4 = new 财务();
		//财务处理者职权比经理大，比老总小，插入到他们之间
		//无需修改其他处理者代码，满足了开闭原则
		handler2.setNextHandler(handler4);
		handler4.setNextHandler(handler3);

		try{
			handler1.handler(total);	//从职权范围最低的处理者开始
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
