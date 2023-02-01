package springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"Be aware of the wolf.....",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// create a random number
	private Random myRandom = new Random();
	
	
	@Override
	public String getDailyFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
