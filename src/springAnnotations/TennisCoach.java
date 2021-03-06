package springAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@PostConstruct
	public void doSomeCrazyStuff(/* @Qualifier("randomFortuneService") FortuneService fortuneService */) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
//		this.fortuneService = fortuneService;
	}

	@Override
	@PreDestroy
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
