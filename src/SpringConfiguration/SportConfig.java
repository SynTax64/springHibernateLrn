package SpringConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("SpringConfiguration/sport.properties")
public class SportConfig {

	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		SwimCoach theCoach = new SwimCoach(happyFortuneService());
		return theCoach;
	}
}