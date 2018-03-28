package DesignPattern.Behavior.Strategy;

/*
 * 普通顾客不打折
 */
public class 普通顾客策略 implements 策略{

	@Override
	public double calcPrice(double price) {
		// TODO Auto-generated method stub
		return price;
	}

}
