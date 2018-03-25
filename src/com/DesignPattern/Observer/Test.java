package com.DesignPattern.Observer;

public class Test {
	public static void main(String[] args){
		/**
		 * 观察者模式
		 */
		美女 pretty = new 美女();
		追求者1 man1 = new 追求者1(pretty);
		pretty.被追求(man1);
		追求者2 man2 = new 追求者2(pretty);
		pretty.被追求(man2);
		
		pretty.恋爱状态("单身");
		pretty.恋爱状态("热恋");
		pretty.恋爱状态("已婚");
	}
}
