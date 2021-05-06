package SpringConfiguration;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sas day";
	}
}