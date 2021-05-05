package springDemoOne.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {
	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");
		// retrieve bean from spring container
		TrackCoach trackCoach = context.getBean("TrackCoach", TrackCoach.class);
		context.close();
	}
}
