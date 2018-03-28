package DesignPattern.Behavior.Handler;

public class 老总 extends 报销处理者{

	@Override
	public void handler(double total) {
		// TODO Auto-generated method stub
		/*
		 * 老总能处理任意金额的报销
		 * 在责任链上最后的处理者必须能处理所有情况，否则如果请求最终得不到处理者响应，责任链的意义将不存在
		 */
		System.out.println("老总有权处理，同意报销");
	}

}
