package springDemoOne.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansScopeApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		TrackCoach myTrachCoach1 = context.getBean("TrackCoach", TrackCoach.class);
		TrackCoach myTrachCoach2 = context.getBean("TrackCoach", TrackCoach.class);

		System.out.println();
	}
}
