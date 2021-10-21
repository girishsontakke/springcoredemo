package com.girish.springIOCandDIWithXML;

public class BaseBallCoach implements Coach {
	
	private FortuneProvider provider;
	public BaseBallCoach(FortuneProvider provider) {
		this.provider = provider;
	}
	
	@Override
	public void getDailyWorkout() {
		System.out.println("play baseball");
		
	}
	
	@Override
	public String getfortune() {
		return this.provider.getfortune();
	}
}
