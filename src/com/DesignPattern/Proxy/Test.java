package com.DesignPattern.Proxy;

public class Test {
	public static void main(String[] args){
		/*
		 * 静态代理模式
		 */
		歌手 jay = new 周杰伦();
		经纪人 jayProxy = new 经纪人(jay);
		jayProxy.谈价格();
		jayProxy.签约();
		jayProxy.唱歌();
		jayProxy.付钱();
	}
}
