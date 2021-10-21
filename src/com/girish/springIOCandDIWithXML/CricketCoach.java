package com.girish.springIOCandDIWithXML;

public class CricketCoach implements  Coach{

	private final FortuneProvider provider;
	public CricketCoach(FortuneProvider provider) {
		this.provider = provider;
	}
	@Override
	public void getDailyWorkout() {
		System.out.println("play cricket");

	}

	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		return this.provider.getfortune();
	}
}
