package DesignPattern.Structure.Proxy;

public class 专业经纪人 extends 经纪人 {
	
	public 专业经纪人(歌手 singer) {
		super(singer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void 谈价格(){
		System.out.println("专业经纪人谈好了价格");
	}
	
	@Override
	public void 签约(){
		System.out.println("专业经纪人签好了合同");
	}
	
	@Override
	public void 付钱(){
		System.out.println("专业经纪人收到了出场费");
	}
}
