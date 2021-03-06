package DesignPattern.Behavior.Handler;

public class 财务 extends 报销处理者{

	@Override
	public void handler(double total) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 新增财务处理者，只能处理小于1000元的报销
		 */
		if( total < 1000 ){
			System.out.println("财务有权处理，同意报销");
		}else{
			System.out.println("财务无权处理，传递给下一处理者");
			报销处理者 nextHandler = this.getNextHandler();
			if( nextHandler != null ){
				nextHandler.handler(total);
			}else{
				throw new Exception("找不到下一处理者异常");
			}
		}
	}

}
