package springDemoOne.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"springDemoOne/applicationContext.xml");

		// retrieve bean from spring container
		Coach baseballCoach = context.getBean("BaseballCoach", Coach.class);

		// call method on the bean
		System.out.println(baseballCoach.getDailyWorkout());

		// let is call our new method for fortunes
		System.out.println(baseballCoach.getDailyFortune());
		// close the context
		context.close();
	}
}
