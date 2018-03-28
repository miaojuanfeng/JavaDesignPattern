package DesignPattern.Builder.Builder;

import java.util.ArrayList;
import java.util.List;

/*
 * 最终要构建的对象，由其他不同的字构成，
 * 相同的字，不同的顺序构成的词的意思也会不同，所以需要引入导演角色来安排顺序
 * 词对象也可以抽象出来，方便扩展，这里省略了
 */
public class 词 {
	private List<String> word = new ArrayList<String>();
	
	/*
	 * 设置名词
	 */
	public void setNounWord(String word){
		this.word.add(word);
	}
	
	/*
	 * 设置动词
	 */
	public void setVerbWord(String word){
		this.word.add(word);
	}
	
	public String getWord(){
		String retval = "";
		for(String w : this.word){
			retval += w;
		}
		return retval;
	}
}
