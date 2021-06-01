package com.basicPackage;

public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public BadmintonCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "The game consist of a racket and shuttle cock";
	}

	@Override
	public String getDailyFortune() {
		return "lets do it " + fortuneService.getFortune();
	}
	
	
}
