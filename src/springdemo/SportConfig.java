package springdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Bean;

@Configuration
//@ComponentScan("springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new sadFortuneService();
	}
	
	
	// define bean for swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
