package com.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class 美女 {
	private List<追求者> man;
	private String status;
	
	public 美女(){
		this.man = new ArrayList<追求者>();
	}
	
	public void 被追求(追求者 man){
		this.man.add(man);
	}
	
	public String 获取美女的恋爱状态(){
		return this.status;
	}
	
	public void 恋爱状态(String status){
		this.status = status;
		for(追求者 single : man){
			single.listen();
		}
	}
}
