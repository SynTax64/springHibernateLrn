package springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class FitnessCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do exercises for the Brust, Biceps and Triceps";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
}