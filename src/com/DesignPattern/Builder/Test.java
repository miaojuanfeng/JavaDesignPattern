package com.DesignPattern.Builder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		词语建造者 wordFactory1 = new 牙和刷建造者();
		导演 wordDirector1 = new 名词导演(wordFactory1);
		System.out.println(wordDirector1.getWord());
		导演 wordDirector2 = new 动词导演(wordFactory1);
		System.out.println(wordDirector2.getWord());
		
		词语建造者 wordFactory2 = new 奶和罩建造者();
		导演 wordDirector3 = new 名词导演(wordFactory2);
		System.out.println(wordDirector3.getWord());
		导演 wordDirector4 = new 动词导演(wordFactory2);
		System.out.println(wordDirector4.getWord());
	}

}
