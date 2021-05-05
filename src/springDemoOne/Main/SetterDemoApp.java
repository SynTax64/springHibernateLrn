package springDemoOne.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"springDemoOne/applicationContext.xml");
		CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

		System.out.println(myCricketCoach.getDailyWorkout());
		System.out.println(myCricketCoach.getDailyFortune());
		System.out.println(myCricketCoach.getEmailAddress());
		System.out.println(myCricketCoach.getTeam());
	}
}