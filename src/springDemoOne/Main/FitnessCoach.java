package springDemoOne.Main;

public class FitnessCoach implements Coach {

	private FortuneService fortuneService;

	public FitnessCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Do exercises for the Brust, Biceps and Triceps";
	}

	@Override
	public String getDailyFortune() {
		return "Today is a fitness day " + fortuneService.getFortune();
	}

}
