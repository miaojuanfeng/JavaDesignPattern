package DesignPattern.Behavior.Strategy;

/*
 * 高级会员打85折
 */
public class 高级会员策略 implements 策略{

	@Override
	public double calcPrice(double price) {
		// TODO Auto-generated method stub
		return price*0.85;
	}

}
