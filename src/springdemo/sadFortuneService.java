package springdemo;

public class sadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is a sad day";
	}

}
