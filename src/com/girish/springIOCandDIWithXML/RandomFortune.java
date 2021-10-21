package com.girish.springIOCandDIWithXML;

public class RandomFortune implements FortuneProvider {
	
	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		String[] fortunes = {"fortune1", "fortune2", "fortune3"};
		int rand = (int)(Math.random() * 3);
		return fortunes[rand];
	}

}
