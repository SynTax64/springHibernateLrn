package springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"springAnnotations/applicationContext.xml");
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(tennisCoach.getDailyWorkout());

		context.close();
	}
}
