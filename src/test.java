import com.DesignPattern.Decorator.*;
import com.DesignPattern.Observer.*;

public class test {
	public static void main(String[] args){
		/**
		 * 装饰模式
		 */
		装饰 decorator1 = new 墙纸(new 腻子粉(new 毛坯墙()));
		decorator1.draw();
		装饰 decorator2 = new 油漆(new 腻子粉(new 毛坯墙()));
		decorator2.draw();
		/**
		 * 观察者模式
		 */
		美女 pretty = new 美女();
		追求者1 man1 = new 追求者1(pretty);
		pretty.被追求(man1);
		追求者2 man2 = new 追求者2(pretty);
		pretty.被追求(man2);
		pretty.恋爱状态("单身");
	}
}
