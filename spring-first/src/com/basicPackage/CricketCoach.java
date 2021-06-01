package com.basicPackage;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress=emailAddress;
	}
	
	public void setTeam(String team) {
		this.team=team;
	}
	
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
	
	public String getTeamDetails() {
		return "Team Name is : " + team + ", Team Email is " + emailAddress;
	}

}
