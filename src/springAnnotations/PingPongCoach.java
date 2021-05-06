package springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	private FortuneService fortuneService;

	public PingPongCoach() {
		System.out.println(">> PingPongCoach: inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
