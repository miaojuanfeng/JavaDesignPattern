package DesignPattern.Behavior.Handler;

public abstract class 报销处理者 {
	private 报销处理者 nextHandler;
	
	public void setNextHandler(报销处理者 nextHandler){
		this.nextHandler = nextHandler;
	}
	
	public 报销处理者 getNextHandler(){
		return this.nextHandler;
	}
	/*
	 * 这里的职权范围只能限定最大值，不能限定最小值，
	 * 不然插入新的处理者时需要修改旧代码的职权范围，破坏了开闭原则
	 * 而只限制了职权最大值，当插入更小职权的处理者时，只要插入在当前处理者之前，就能拦截更小职权的请求了
	 */
	public abstract void handler(double total) throws Exception;
}
