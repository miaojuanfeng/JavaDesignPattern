package DesignPattern.Behavior.Strategy;

/*
 * 中级会员打9折
 */
public class 中级会员策略 implements 策略{

	@Override
	public double calcPrice(double price) {
		// TODO Auto-generated method stub
		return price*0.9;
	}

}
