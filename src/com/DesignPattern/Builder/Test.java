package com.DesignPattern.Builder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		词语建造者 factory = null;
		导演 director = null;
		词 word = null;
		
		factory = new 牙和刷建造者();
		director = new 名词导演(factory);
		word = director.construct();
		System.out.println(word.getWord());
		director = new 动词导演(factory);
		word = director.construct();
		System.out.println(word.getWord());
		
		factory = new 奶和罩建造者();
		director = new 名词导演(factory);
		word = director.construct();
		System.out.println(word.getWord());
		director = new 动词导演(factory);
		word = director.construct();
		System.out.println(word.getWord());
	}

}
