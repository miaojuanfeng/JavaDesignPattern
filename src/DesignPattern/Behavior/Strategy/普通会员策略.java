package DesignPattern.Behavior.Strategy;

/*
 * 普通会员打95折
 */
public class 普通会员策略 implements 策略{

	@Override
	public double calcPrice(double price) {
		// TODO Auto-generated method stub
		return price*0.95;
	}
	
}
