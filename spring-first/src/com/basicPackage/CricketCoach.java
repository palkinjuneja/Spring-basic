package com.basicPackage;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Cricket Coach :: Entering Constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach :: Entering Setter Method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 10 mins daily";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
