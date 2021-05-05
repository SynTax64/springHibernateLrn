package springAnnotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private String[] data = { "Beware of the wolf in sheep's clotching", "Diligence is the mother of goog luck",
			"The journey is the reward" };

	private Random rnd = new Random();

	@Override
	public String getFortune() {
		int rndNum = rnd.nextInt(data.length);
		return data[rndNum];
	}
}
