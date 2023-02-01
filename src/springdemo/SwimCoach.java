package springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneservice;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneservice = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getDailyFortune();
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team;
	}
	
	

}
