package DesignPattern.Builder.Builder;

public class 牙和刷建造者 extends 词语建造者{

	@Override
	public void buidNounWord() {
		// TODO Auto-generated method stub
		字 nounWord = new 牙();
		this.word.setNounWord(nounWord.getWord());
	}

	@Override
	public void buidVerbWord() {
		// TODO Auto-generated method stub
		字 verbWord = new 刷();
		this.word.setVerbWord(verbWord.getWord());
	}

	@Override
	public 词 getResult() {
		// TODO Auto-generated method stub
		return this.word;
	}
	
}
