package DesignPattern.Behavior.Strategy;

/*
 * 当有新策略加入时，实现该接口就行了
 */
public interface 策略 {
	public double calcPrice(double price);
}
