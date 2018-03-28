package DesignPattern.Behavior.Strategy;

public class Test {
	public static void main(String[] args){
		/*
		 * 策略模式
		 */
		double totalPrice = 360.0;				//顾客买了360元商品
		double payPrice = totalPrice; 			//折扣后总价
		环境 context;							//结账环境
		策略 strategy;							//根据顾客身份决定采用哪种策略
		
		strategy = new 普通顾客策略();				//顾客不是会员
		context = new 环境(strategy);			//顾客来到收银台
		payPrice = context.calcPrice(totalPrice);	//打折后价格
		System.out.println("普通顾客折后价："+payPrice);
		
		strategy = new 普通会员策略();
		context = new 环境(strategy);
		payPrice = context.calcPrice(totalPrice);
		System.out.println("普通会员折后价："+payPrice);
		
		strategy = new 中级会员策略();
		context = new 环境(strategy);
		payPrice = context.calcPrice(totalPrice);
		System.out.println("中级会员折后价："+payPrice);
		
		strategy = new 高级会员策略();
		context = new 环境(strategy);
		payPrice = context.calcPrice(totalPrice);
		System.out.println("高级会员折后价："+payPrice);
	}
}
